/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.chapter.one.buildingblocks;

/**
 *
 * @author nestormoreno
 */
public class Demo {
    //lossy conversion from double to float
    float value = 102.56;
    float value1 = 102;
    float value2 = (int)102.0;
    //can not convert from double to float
    float value3 = 1f * 0.0;
    float value4 = 1f * (short)0.0;
    //can not convert from int to boolean
    float value5 = 1f * (boolean)0;
    
}
