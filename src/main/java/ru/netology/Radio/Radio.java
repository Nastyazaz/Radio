package ru.netology.Radio;

public class Radio {
    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setMinNumber() {
        currentNumber = 0;
    }

    public void setMaxNumber() {
        currentNumber = 9;
    }

    public void next() {
        if (currentNumber != 9) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber != 0) {
            currentNumber--;
        } else {
            currentNumber = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void AddVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume +1;
        } else {
            currentVolume = 100;
        }
    }

    public void ReduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}

