package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

    public class TestIOConsoleString {

        private IOConsole IOConsole;

        @Test
        public void test1() {
            testString("Spot");
        }

        @Test
        public void test2() {
            testString("Charlie");
        }

        @Test
        public void test3() {
            testString("Bally");
        }

        @Test
        public void test4() {
            testString("Something");
        }

        @Test
        public void test5() {
            testInteger("1.4E-45", Float.MIN_VALUE);
        }

        @Test
        public void test6() {
            testInteger("1.0", 1F);
        }

        @Test(expected=NoSuchElementException.class)
        public void test7() {
            testInteger("_", null);
        }

        @Test
        public void test8() {
            testInteger("0", 0F);
        }

        @Test
        public void test9() {
            testInteger("1", 1F);
        }


        private void testString(String input) {
            // Given
            String expected = input;
            this.IOConsole = getConsoleWithBufferedInput(input);

            // When
            String actual = IOConsole.getNameOfAnimal("");

            // Then
            Assert.assertEquals(actual, expected);
        }

        private void testInteger(String input, Float expectedInput) {
            // Given
            this.IOConsole = getConsoleWithBufferedInput(input);

            // When
            Float actual = IOConsole.getFloatInput("");

            // Then
            Assert.assertEquals(actual, expectedInput);
        }

        private IOConsole getConsoleWithBufferedInput(String inputString) {
            byte[] inputBytes = inputString.getBytes();
            ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
            Scanner scanner = new Scanner(inputByteArray);
            IOConsole IOConsole = new IOConsole(scanner, System.out);
            return IOConsole;
        }
}
