package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class RadioTest {


    @Test
    public void shouldUnderMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(2);
        radio.setMinNumber();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAfterMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        int expected = 1;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderLastNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        int expected = 8;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxNumber() {
        Radio radio = new Radio();
        radio.setMaxNumber();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAfterMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddAfterMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddUnderMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddAfterMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.setCurrentNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUpperFirstBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUnderMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUpperMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.AddVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseFirstVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.AddVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.AddVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.AddVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolume(0);
        radio.ReduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.ReduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.ReduceVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.ReduceVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
