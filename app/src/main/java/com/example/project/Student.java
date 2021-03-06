package com.example.project;

import android.os.Parcel;
import android.os.Parcelable;

//This class inherits from User, and is used to represent a student
public class Student extends User implements Parcelable {
    private int mLevel;
    private int mScore;
    private int mGameType;
    private String mAge;
    private String mTeacherId;
    private String mGoal;

    public Student(String iEmail, String iPassword, String iFirstName,
                   String iLastName, String iCity, String iId,
                   int iLevel, String iAge, int iScore,
                   String iTeacherId, int iGameType){
        super(iEmail, iPassword, iFirstName, iLastName, iCity, iId);
        this.mLevel = iLevel;
        this.mAge = iAge;
        this.mScore = iScore;
        this.mTeacherId = iTeacherId;
        this.mGameType = iGameType;
        setmType("student");
    }

    public Student (String iEmail, String iPassword, String iFirstName,
                    String iLastName, String iTeacherId, String iGoal)
    {
        super(iEmail, iPassword, iFirstName, iLastName, "", "");
        this.mLevel = 0;
        this.mScore = 0;
        this.mTeacherId = iTeacherId;
        this.mGoal = iGoal;
    }

    public Student (String iFirstName, String iLastName, String iId,
                    String iUserType, String iLevel, String iGoal,
                    String iScore)
    {
        super(iFirstName, iLastName, iId, iUserType);
        this.mLevel = Integer.parseInt(iLevel);
        this.mGoal = iGoal;
        this.mScore = Integer.parseInt(iScore);
    }

    protected Student(Parcel in) {
        mLevel = in.readInt();
        mAge = in.readString();
        mScore = in.readInt();
        mTeacherId = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public int getmLevel() {
        return mLevel;
    }

    public int getmGameType() {
        return mGameType;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    public void increasemScore() {
        this.mScore++;
    }

    public String getmTeacherId() {
        return mTeacherId;
    }

    public void setmTeacherId(String mTeacherId) {
        this.mTeacherId = mTeacherId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mLevel);
        dest.writeString(mAge);
        dest.writeInt(mScore);
        dest.writeString(mTeacherId);
    }

    public String getmGoal(){return this.mGoal;}
}
