package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testConstructorWithDefaultNumberOfStations() {
        Radio radio = new Radio(9, 0, 100, 0);
        Assertions.assertEquals(9, radio.getMaxNumber());
        Assertions.assertEquals(0, radio.getMinNumber());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }


    @Test
    public void shouldUnderMinNumberAndMinVolume() {
        Radio radio = new Radio(-1);
        Assertions.assertEquals(0, radio.getCurrentNumber());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testSetMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        Assertions.assertEquals(0, radio.getCurrentNumber());

    }
    @Test
    void testSetCurrentNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        Assertions.assertEquals(1, radio.getCurrentNumber());

    }

    @Test
    public void shouldSetMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(2);
        radio.setMinNumber();
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetUnderLastNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        Assertions.assertEquals(8, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetMaxNumber() {
        Radio radio = new Radio();
        radio.setMaxNumber();
        Assertions.assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void shouldNotSetAfterMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.next();
        Assertions.assertEquals(1, radio.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseAfterMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.next();
        Assertions.assertEquals(2, radio.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseUnderMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.next();
        Assertions.assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseAfterMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldDecreaseMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.setCurrentNumber(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentNumber());
    }
    @Test
    public void shouldDecreaseUpperFirstBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }
    @Test
    public void shouldDecreaseUnderMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.prev();
        Assertions.assertEquals(7, radio.getCurrentNumber());
    }
    @Test
    public void shouldDecreaseMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.prev();
        Assertions.assertEquals(8, radio.getCurrentNumber());
    }
    @Test
    public void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }
    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setMinVolume();
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }
    @Test
    public void shouldSetUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

        @Test
    void testSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

        @Test
    public void shouldNotSetUpperMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.AddVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseFirstVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.AddVolume();
        Assertions.assertEquals(2, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.AddVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.AddVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolume(0);
        radio.ReduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.ReduceVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.ReduceVolume();
        Assertions.assertEquals(98, radio.getCurrentVolume());
    }


    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.ReduceVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }


    @Test
    void testNextMethods() {
        Radio radio = new Radio();
        radio.next();
        assertEquals(1, radio.getCurrentNumber());
        radio.next();
        assertEquals(2, radio.getCurrentNumber());
        radio.next();
        assertEquals(3, radio.getCurrentNumber());
        radio.next();
        assertEquals(4, radio.getCurrentNumber());
        radio.next();
        assertEquals(5, radio.getCurrentNumber());
        radio.next();
        assertEquals(6, radio.getCurrentNumber());
        radio.next();
        assertEquals(7, radio.getCurrentNumber());
        radio.next();
        assertEquals(8, radio.getCurrentNumber());
        radio.next();
        assertEquals(9, radio.getCurrentNumber());
        radio.next();
        assertEquals(0, radio.getCurrentNumber());
    }
}












