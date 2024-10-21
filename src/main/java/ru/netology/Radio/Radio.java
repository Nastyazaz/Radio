package ru.netology.Radio;

public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int maxNumber;

    public Radio() {
        this.maxNumber = 9;
    }

    public Radio(int numberSize) {
        this.maxNumber = numberSize - 1;
    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setMinNumber() {
        currentNumber = 0;
    }

    public void setMaxNumber() {
        currentNumber = maxNumber;
    }

    public void next() {
        if (currentNumber != maxNumber) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber != 0) {
            currentNumber--;
        } else {
            currentNumber = maxNumber;
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
            currentVolume = currentVolume + 1;
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


