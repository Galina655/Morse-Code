/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpainanalyzer;

import jsjf.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author cim217
 */
public class MorseCodeTree {

    private LinkedBinaryTree<String> mTree;
    private char dot = '.';
    private char dash = '-';
    private char empty = ' ';
    private char pound = '#';
    private String output = "";
    private char bar = '|';
    private LinkedBinaryTree<String> current;

    public MorseCodeTree() {

        String empty = " ";
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        String H = "H";
        String I = "I";
        String J = "J";
        String K = "K";
        String L = "L";
        String M = "M";
        String N = "N";
        String O = "O";
        String P = "P";
        String Q = "Q";
        String R = "R";
        String S = "S";
        String T = "T";
        String U = "U";
        String V = "V";
        String W = "W";
        String X = "X";
        String Y = "Y";
        String Z = "Z";

        LinkedBinaryTree<String> a, b, c, d, e, f, g, h, i, j, k, l,
                m, n, o, p, q, r, s, t, u, v, w, x, y, z, emptyT;

        //build the tree
        emptyT = new LinkedBinaryTree<>(empty);

        h = new LinkedBinaryTree<>(H);
        v = new LinkedBinaryTree<>(V);
        s = new LinkedBinaryTree<>(S, h, v);

        f = new LinkedBinaryTree<>(F);
        u = new LinkedBinaryTree<>(U, f, emptyT);

        i = new LinkedBinaryTree<>(I, s, u);

        l = new LinkedBinaryTree<>(L);
        r = new LinkedBinaryTree<>(R, l, emptyT);

        p = new LinkedBinaryTree<>(P);
        j = new LinkedBinaryTree<>(J);
        w = new LinkedBinaryTree<>(W, p, j);

        a = new LinkedBinaryTree<>(A, r, w);

        e = new LinkedBinaryTree<>(E, i, a);

        b = new LinkedBinaryTree<>(B);
        x = new LinkedBinaryTree<>(X);
        d = new LinkedBinaryTree<>(D, b, x);

        c = new LinkedBinaryTree<>(C);
        y = new LinkedBinaryTree<>(Y);
        k = new LinkedBinaryTree<>(K, c, y);

        n = new LinkedBinaryTree<>(N, d, k);

        z = new LinkedBinaryTree<>(Z);
        q = new LinkedBinaryTree<>(Q);
        g = new LinkedBinaryTree<>(G, z, q);

        o = new LinkedBinaryTree<>(O);
        m = new LinkedBinaryTree<>(M, g, o);

        t = new LinkedBinaryTree<>(T, n, m);

        mTree = new LinkedBinaryTree<>(empty, e, t);
    }

    public String toString() 
    {

        String showNodes = "";
        showNodes += mTree;
        return showNodes;
    }
    
    public void translate()
    {
        String in;
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter the morse code you'd like"
                + " to be translated. \nSeparate each letter with space,"
                + "each word with | and the end of the sentence with # > ");
        in = cin.nextLine();
        evaluate(in);
        
    }

    public void evaluate(String input) {
        
        current = mTree; //initialize the current node to be the root
        //scan each character from the string
        for (int index = 0; index < input.length(); index++) {
            //if it's not a space then evaluate the symbols
            if (input.charAt(index) != empty) {
                getSymbol(input.charAt(index));
                //if char equals | then put a space between the words
                if (input.charAt(index) == bar) {
                    output +=" ";
                }

            } 
            //if the current char is space or a pound symbol then 
            //this means we're either at the end of the letter
            //so we can finally get the elemen, or
            //at the end of the sentence
            else if (input.charAt(index) == empty || input.charAt(index) == pound) 
            {

                output += current.getRootElement();
                //after getting the current letter, we need to initialize
                //the current to the root of the tree, since we'll
                //start traversing again from the beginning for 
                //the new letter
                current = mTree;

            }

        }
        //finally display the sentencce that was translated
        System.out.println(output);
    }

    public void getSymbol(char c) {
        //if our character is a . then go left
        if (c == dot) {
            current = current.getLeft();

        } else if (c == dash) {
            //if our character is a - then go right
            current = current.getRight();
        }

    }

}
