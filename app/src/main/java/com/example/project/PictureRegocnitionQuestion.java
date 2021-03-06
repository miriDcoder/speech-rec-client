package com.example.project;

//this class handles an audio recognition game single question
public class PictureRegocnitionQuestion extends Question{
    private String mImgPath;
    private int mAudioClue;

    public PictureRegocnitionQuestion(Question question){
        super(question.GetmAnswer(), question.getmImageUrl(), question.GetmAudioRecording(), question.GetmLevel(),question.GetmId());
        this.mImgPath = question.getmImageUrl();
        this.mAudioClue = question.GetmAudioRecording();
    }

    public String getmImgPath(){
        return this.mImgPath;
    }

    public int getmAudioClue(){
        return this.mAudioClue;
    }

}