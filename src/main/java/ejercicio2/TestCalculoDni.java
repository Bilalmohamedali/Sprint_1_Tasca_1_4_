package ejercicio2;

import jdk.jfr.Name;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculoDni {

    @Test
    @Name("Calcular letra")
    void calculateLetter() {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(00000001);
        numList.add(00000002);
        numList.add(00000003);
        numList.add(00000004);
        numList.add(00000005);
        numList.add(00000006);
        numList.add(00000007);
        numList.add(11111111);
        numList.add(22222222);
        numList.add(33333333);

        ArrayList<Character> lettersList = new ArrayList<>();
        lettersList.add('R');
        lettersList.add('W');
        lettersList.add('A');
        lettersList.add('G');
        lettersList.add('M');
        lettersList.add('Y');
        lettersList.add('F');
        lettersList.add('H');
        lettersList.add('J');
        lettersList.add('P');

        ArrayList<Character> tempList = new ArrayList<>();
        int i =0;
        for(i=0; i<numList.size(); i++){
            tempList.add(CalculoDni.calculateLetter(numList.get(i)));
        }

        assertEquals (lettersList,tempList);

    }
}

