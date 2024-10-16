package ru.netology.Radio;

public class Radio {
    private int MaxNumber = 9;
    private int MinNumber = 0;
    private int currentNumber = MinNumber;
    private int MaxVolume = 100;
    private int MinVolume = 0;
    private int currentVolume = MinVolume;

    public Radio (int MaxNumber, int MinNumber, int MaxVolume, int MinVolume){
        this.MaxNumber = MaxNumber ;
        this.MinNumber = MinNumber ;
        this.currentNumber = MinNumber;

        this.MaxVolume = MaxVolume;
        this.MinVolume = MinVolume;
        this.currentVolume = MinVolume;

    }
    public Radio (int size){
        MaxVolume = MinVolume + size;
        MaxNumber = MinNumber + size;


    }

    public Radio() {

    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getMaxNumber(){
        return MaxNumber;
    }

    public int getMinNumber(){
        return MinNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < MinNumber) {
            return;
        }
        if (newCurrentNumber > MaxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setMinNumber() {

        currentNumber = MinNumber;
    }

    public void setMaxNumber() {

        currentNumber = MaxNumber;
    }

    public void next() {
        if (currentNumber != MaxNumber) {
            currentNumber++;
        } else {
            currentNumber = MinNumber;
        }
    }

    public void prev() {
        if (currentNumber != MinNumber) {
            currentNumber--;
        } else {
            currentNumber = MaxNumber;
        }
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return MaxVolume;
    }

    public int getMinVolume(){
        return MinVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < MinVolume) {
            return;
        }
        if (newCurrentVolume > MaxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMinVolume() {
        currentVolume = MinVolume;
    }

    public void setMaxVolume() {
        currentVolume = MaxVolume;
    }

    public void AddVolume() {
        if (currentVolume < MaxVolume) {
            currentVolume = currentVolume +1;
        } else {
            currentVolume = MaxVolume;
        }
    }

    public void ReduceVolume() {
        if (currentVolume > MinVolume) {
            currentVolume--;
        } else {
            currentVolume = MinVolume;
        }
    }
}

