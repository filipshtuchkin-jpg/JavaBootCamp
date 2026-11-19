package sef.module9.activity;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before

    public void setUp() throws Exception {

        // TODO: Initialize person object
        person = new Person();

    }

    @After

    public void tearDown() throws Exception {

        // TODO: Tear down person object (set to null)
         person = null;
    }

    @Test

    public void testGettersAndSetters() {

        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(86);
        assertEquals(86, person.getWeight());
        person.setHeight(1.73f);
        assertEquals(1.73f, person.getHeight(), 0.001);

    }

    @Test

    public void testGetBodyMassIndex() {

        assertEquals("Underweight", person.getBodyMassIndex(50, 1.75));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.75));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));

        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)

        assertEquals("Invalid input", person.getBodyMassIndex(-10, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(700, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 4.0));
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));

        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)

    }

}
