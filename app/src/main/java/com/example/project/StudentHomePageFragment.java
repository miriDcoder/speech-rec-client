package com.example.project;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//This is a student home page
public class StudentHomePageFragment extends Fragment {
    private Student mStudent;

    public StudentHomePageFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student_home_page, container, false);
        TextView textViewHello = v.findViewById(R.id.textViewHeader);
        TextView textViewYourScore = v.findViewById(R.id.textViewYourScore);
        TextView textViewScore = v.findViewById(R.id.textViewScore);
        TextView textViewLevel = v.findViewById(R.id.textViewLevel);
        Button buttonPlay = (Button)v.findViewById(R.id.buttonPlay);
        Button buttonInstructions = (Button)v.findViewById(R.id.buttonGameInstructions);
        if(getArguments() != null)
        {
            mStudent = getArguments().getParcelable("user");
        }
        displayMyInfo(mStudent, textViewHello, textViewYourScore, textViewScore ,textViewLevel);

        //Setting up the play button to match the game to the student's goal
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStudent.getmLevel() <= 3) {    // Can play only untill level 3 in this version
                    Intent intent = null;
                    switch (mStudent.getmGoal()) {
                        case "1":
                            intent = new Intent(getActivity(), AudioRecognitionLevel.class);
                            intent.putExtra("level", Integer.toString(mStudent.getmLevel()));
                            intent.putExtra("id", mStudent.getmId());
                            intent.putExtra("user_type", mStudent.getmType());
                            startActivity(intent);
                            ((Activity) getActivity()).overridePendingTransition(0, 0);
                            break;
                        case "2":
                            intent = new Intent(getActivity(), PictureRecognitionLevel.class);
                            intent.putExtra("level", Integer.toString(mStudent.getmLevel()));
                            intent.putExtra("id", mStudent.getmId());
                            intent.putExtra("user_type", mStudent.getmType());
                            startActivity(intent);
                            ((Activity) getActivity()).overridePendingTransition(0, 0);
                            break;
                    }
                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    String msg = "כל הכבוד, סיימת את כל השלבים! אנחנו עובדים על שלבים נוספים שיגיעו בהמשך... בהצלחה! ";
                    builder.setMessage(msg);
                    builder.setPositiveButton("הבנתי", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

        //Showing instructions for the student, in accordance to the goal
        buttonInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                String msg;
                switch (mStudent.getmGoal())
                {
                    case "1":
                        msg = getResources().getString(R.string.game_instructions_audio);
                        break;
                    case "2":
                        msg = getResources().getString(R.string.game_instructions_picture);
                        break;
                    default:
                        msg = getResources().getString(R.string.error_msg);
                }
                builder.setMessage(msg).setTitle(getResources().getString(R.string.game_instructions_header));
                builder.setPositiveButton("הבנתי", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        return v;
    }

    //Display student info in home page
    private void displayMyInfo(Student iStudent, TextView iTextViewHeader, TextView iTextViewYourScore, TextView iTextViewScore, TextView iTextViewLevel) {
        iTextViewHeader.setText(String.format("שלום, %s!", iStudent.getmFirstName()));
        iTextViewYourScore.setText(String.format("הניקוד שלך"));
        iTextViewScore.setText(String.format("%d", mStudent.getmScore()));
        iTextViewLevel.setText(String.format("שלב %d מתוך 10", iStudent.getmLevel()));
    }

}