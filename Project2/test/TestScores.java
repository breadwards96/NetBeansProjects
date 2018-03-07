
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonedwards
 */
public class TestScores {

    public TestScores(int[] scores) {
        for (int x = 0; x < scores.length; x++) {

            if (scores[x] < 0 || scores[x] > 100) {
                throw new IllegalArgumentException();
            }
        }
    }
}
