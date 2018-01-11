/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonedwards
 */
public class Play1000SlotMachines {
    
    public static void main(String [] args){
        
        int winner = 0;
        
        SlotMachine[] slotArray;
        slotArray = new SlotMachine[1000];
        
        for(int x = 0; x < slotArray.length; x++){
            slotArray[x] = new SlotMachine();
            if(slotArray[x].isWinner()){
                winner++;
            }
        }
        System.out.println("Out of 1000 slot machines, " + winner + " were winners." );
    }
}
