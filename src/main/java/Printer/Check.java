package Printer;

import Order.*;
import java.util.ArrayList;

public class Check {
    private  ArrayList<DataForCheck> checkData = new ArrayList<DataForCheck>();

    public  void findThingInCheck(Thing thing){//group by name
        boolean k = false;
        for (DataForCheck data: checkData) {
            if(data.thing.getName().equals( thing.getName() )) {
                data.numOfThisThing++;
                k = true;
                break;
            }
        }
        if(!k){
            checkData.add(new DataForCheck(thing));
        }
    }

    private String numTab(String str){
        if(str.length() < 4) {
            return str + "\t\t\t\t";
        }
        else if (str.length() > 7) {
            return str + "\t\t";
        } else {
            return str + "\t\t\t";
        }
    }

    private String numTab(double value){
        if(value < 10000){
            if(value < 10){
                return value + "\t\t\t\t\t\t";
            }
            else {
                return value + "\t\t\t\t\t";
            }
        }
        else if(value >= 100000) {
            return value + "\t\t";
        }
        else{
            return value + "\t\t";
        }
    }

    private  StringBuilder text =
            new StringBuilder(
                    "Category\t\t"
                    +"Name\t\t"
                    +"Price without share\t\t"
                    +"Price with share\t"
                    +"Num things\t\t"
                    +"Total price\n"
            );

    public Check(Basket basket){

        for (Thing thing: basket.getOrderList()) {
            findThingInCheck(thing);
        }

        text.append("---------------------------------------------------");
        text.append("---------------------------------------------------\n");

        for(DataForCheck data: checkData){
            text    .append( numTab( data.thing.getCategoryName().toString() ) )
                    .append( numTab( data.thing.getName()))
                    .append( numTab( data.thing.getPriceWithoutDiscountAndShare().doubleValue() ) )
                    .append( numTab( String.format("%.2f",data.thing.getPriceDiscountAndShare().doubleValue() ) ) )
                    .append( numTab( "\tx"+data.numOfThisThing))
                    .append( String.format( "%.2f",data.numOfThisThing*data.thing.getPriceDiscountAndShare().doubleValue() ) )
                    .append("\n");
        }

        text.append("---------------------------------------------------");
        text.append("---------------------------------------------------\n");
        text    .append( "Total without discount and share:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" )
                .append( String.format("%.2f",basket.getTotalPrice().doubleValue() ) )
                .append( "\nTotal with discount and share:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" )
                .append( String.format( "%.2f",basket.getTotalDiscountAndSharePrice().doubleValue() ) )
                .append( "\n" );
    }

    public void print(){
        System.out.print(text);
    }
}
