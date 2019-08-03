package com.example.project;

import java.util.ArrayList;

public class QuestionsData {
    ArrayList<ArrayList<Question>> questionsData = new ArrayList<ArrayList<Question>>();
    private ArrayList<Question> questionsLevel1 = new ArrayList<Question>();
    private ArrayList<Question> questionsLevel2 = new ArrayList<Question>();
    private ArrayList<Question> questionsLevel3 = new ArrayList<Question>();

    private int mSizeOfLevel1;
    private int mSizeOfLevel2;
    private int mSizeOfLevel3;

    public void makeQuestionList() {
        //Level 1 questions
        questionsLevel1.add(new Question("לימון", "https://imagizer.imageshack.com/img921/9784/NzTcE7.jpg", "boker_tov", 1, 0));
        questionsLevel1.add(new Question("תות", "https://imagizer.imageshack.com/img922/2140/4UO1Ae.png", "boker_tov", 1, 1));
        questionsLevel1.add(new Question("צב", "https://imagizer.imageshack.com/img921/7118/MC0ODM.png", "boker_tov", 1, 2));
        questionsLevel1.add(new Question("תינוק", "https://imagizer.imageshack.com/img924/1850/Bx2dNE.png", "boker_tov", 1, 3));
        questionsLevel1.add(new Question("בלון", "https://imagizer.imageshack.com/img924/391/47dmi5.png", "boker_tov", 1, 4));
        questionsLevel1.add(new Question("בננה", "https://imagizer.imageshack.com/img923/6608/KHEQOG.png", "boker_tov", 1, 5));
        questionsLevel1.add(new Question("ציפור", "https://imagizer.imageshack.com/img924/9495/ZRq1zq.png", "boker_tov", 1, 6));
        questionsLevel1.add(new Question("גזר", "https://imagizer.imageshack.com/img922/7832/1H5nbJ.png", "boker_tov", 1, 7));
        questionsLevel1.add(new Question("ארנב", "https://imagizer.imageshack.com/img924/7688/p0TUVG.png", "boker_tov", 1, 8));
        questionsLevel1.add(new Question("בובה", "https://imagizer.imageshack.com/img924/8034/pbtjYZ.png", "boker_tov", 1, 9));
        questionsLevel1.add(new Question("תוף", "https://imagizer.imageshack.com/img923/4078/nJcqrL.png", "boker_tov", 1, 10));
        questionsLevel1.add(new Question("כלב", "https://imagizer.imageshack.com/img922/964/ba8OYg.png", "boker_tov", 1, 11));
        questionsLevel1.add(new Question("בית", "https://imagizer.imageshack.com/img921/3083/jGYCs2.png", "boker_tov", 1, 12));
        questionsLevel1.add(new Question("מפה", "https://imagizer.imageshack.com/img922/8577/89Ek20.png", "boker_tov", 1, 13));
//        questionsLevel1.add(new Question("בית", "https://imagizer.imageshack.com/img921/3083/jGYCs2.png", "boker_tov", 1, 14));


        mSizeOfLevel1 = questionsLevel1.size();

        //Level 2 questions
        questionsLevel2.add(new Question("מוצץ", "https://imagizer.imageshack.com/img923/6172/7vmOw4.png", "boker_tov", 2, 0));
        questionsLevel2.add(new Question("עץ", "https://imagizer.imageshack.com/img922/2371/PGyfTj.png", "boker_tov", 2, 1));
        questionsLevel2.add(new Question("תפוח", "https://imagizer.imageshack.com/img924/3873/bI3UFj.png", "boker_tov", 2, 2));
        questionsLevel2.add(new Question("פרפר", "https://imagizer.imageshack.com/img923/657/qVfkgx.png", "boker_tov", 2, 3));
        questionsLevel2.add(new Question("ליצן", "https://imagizer.imageshack.com/img921/1976/q5pAcM.png", "boker_tov", 2, 4));
        questionsLevel2.add(new Question("שמלה", "https://imagizer.imageshack.com/img921/1479/Uv1Rzi.png", "boker_tov", 2, 5));
        questionsLevel2.add(new Question("ברווז", "https://imagizer.imageshack.com/img924/1157/wwEirS.png", "boker_tov", 2, 6));
        questionsLevel2.add(new Question("גיטרה", "https://imagizer.imageshack.com/img923/4660/HGPhZO.png", "boker_tov", 2, 7));
        questionsLevel2.add(new Question("עיניים", "https://imagizer.imageshack.com/img922/438/TGHvw7.png", "boker_tov", 2, 8));
        questionsLevel2.add(new Question("חתול", "https://imagizer.imageshack.com/img922/4481/6SmxEn.png", "boker_tov", 2, 9));
        questionsLevel2.add(new Question("ביצה", "https://imagizer.imageshack.com/img923/4951/GJUM9J.png", "boker_tov", 2, 10));
        questionsLevel2.add(new Question("פרח", "https://imagizer.imageshack.com/img924/6007/EzaUxS.png", "boker_tov", 2, 11));
        questionsLevel2.add(new Question("אריה", "https://imagizer.imageshack.com/img924/7302/SDuNXV.png", "boker_tov", 2, 12));
        questionsLevel2.add(new Question("רכבת", "https://imagizer.imageshack.com/img921/6337/epxIOF.png", "boker_tov", 2, 13));
        questionsLevel2.add(new Question("שמש", "https://imagizer.imageshack.com/img923/5425/3pufVT.png", "boker_tov", 2, 14));



        mSizeOfLevel2 = questionsLevel2.size();

        //Level 3 questions
        questionsLevel3.add(new Question("מכונית", "https://imagizer.imageshack.com/img921/2248/T0qnQp.png", "boker_tov", 3, 0));
        questionsLevel3.add(new Question("דובדבן", "https://imagizer.imageshack.com/img923/7953/suSRnd.png", "boker_tov", 3, 1));
        questionsLevel3.add(new Question("אופניים", "https://imagizer.imageshack.com/img924/3996/UzqiCo.png", "boker_tov", 3, 2));
        questionsLevel3.add(new Question("משקפיים", "https://imagizer.imageshack.com/img923/5694/hRV5XH.png", "boker_tov", 3, 3));
        questionsLevel3.add(new Question("עיפרון", "https://imagizer.imageshack.com/img922/8040/ZqXmKe.png", "boker_tov", 3, 4));
        questionsLevel3.add(new Question("כבשה", "https://imagizer.imageshack.com/img921/7651/8PD8rk.png", "boker_tov", 3, 5));
        questionsLevel3.add(new Question("מחבת", "https://imagizer.imageshack.com/img923/9826/41E9wr.png", "boker_tov", 3, 6));
        questionsLevel3.add(new Question("מברשת שיניים", "https://imagizer.imageshack.com/img924/2352/4As6x2.png", "boker_tov", 3, 7));
        questionsLevel3.add(new Question("אבטיח", "https://imagizer.imageshack.com/img921/923/h4x8ZO.png", "boker_tov", 3, 8));

        mSizeOfLevel3 = questionsLevel3.size();

        questionsData.add(questionsLevel1);
        questionsData.add(questionsLevel2);
        questionsData.add(questionsLevel3);

    }

    public int getSizeOfLevel(int level){
        int size;
        switch(level){
            case 1:
                size = this.mSizeOfLevel1;
                break;
            case 2:
                size = this.mSizeOfLevel2;
                break;
            case 3:
                size = this.mSizeOfLevel3;
                break;
            default:
                size = this.mSizeOfLevel1;
        }
        return size;
    }

    public Question getRandomQuestion(int level){
        Question randQuestion = null;
        int index;
        int max;
        max = getSizeOfLevel(level);
        index = (int)(Math.random() * (max));
        randQuestion = questionsData.get(level-1).get(index);
        return randQuestion;
    }
}