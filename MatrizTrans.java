package Ejercicio03;

import javax.swing.JOptionPane;

public class MatrizTrans 
{
    private int[][] matriz;
    private int[][] transpuesta;
    private int fila;
    private int columna;
    private int valor;

    public MatrizTrans(int [][] matriz, int [][] transpuesta, int fila, int columna, int valor)
    {
        this.matriz = matriz;
        this.transpuesta = transpuesta;
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
    public MatrizTrans() {
    }
    public void setmatriz(int [][] matriz)
    {
        this.matriz = matriz;
    }
    public void settranspuesta(int [][] transpuesta)
    {
        this.transpuesta = transpuesta;
    }
    public void setfila(int fila)
    {
        this.fila = fila;
    }
    public void setcolumna(int  columna)
    {
        this.columna = columna;
    }
    public void setvalor(int valor)
    {
        this.valor = valor;
    }

    public int [][] getmatriz()
    {
        return matriz;
    }
    public int [][] gettranspuesta()
    {
        return transpuesta;
    }
    public int getfila()
    {
        return fila;
    }
    public int  getcolumna()
    {
        return columna;
    }
    public int  getvalor()
    {
        return valor;
    }

    public void tamañoMatriz()
    {
        this.fila = Integer.parseInt(JOptionPane.showInputDialog("INGRESE FILA: "));
        this.columna = Integer.parseInt(JOptionPane.showInputDialog("INGRESE COLUMNA: "));

        this.matriz = new int[this.fila][this.columna];
        this.transpuesta = new int[this.fila][this.columna];
    }

    public void agregarMatriz()
    {
        for(int i = 0; i<matriz.length; i++)
        {
            for(int j = 0; j<matriz[i].length; j++)
            {
                this.valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor"));
                this.matriz[i][j] = this.valor;

            }
        }
    }

    public void mostrarMatriz()
    {
        System.out.println("*******MOSTRAR MATRIZ********");
        for(int i = 0; i<matriz.length; i++)
        {
            for(int j = 0; j<matriz[i].length; j++)
            {
                System.out.println(this.matriz[i][j]+" ");

            } 
            System.out.println();
        }
    }

    public void transMatriz()
    {
        for(int i = 0; i<matriz.length; i++)
        {
            for(int j = 0; j<matriz[i].length; j++)
            {
                this.transpuesta[i][j] = this.matriz[i][j]; //almacena indice invertido

            } 
        }

    }

    public void mostrarTrans()
    {
        System.out.println("*******MOSTRAR TRANSPUESTA********");
       for(int i = 0; i<transpuesta.length; i++)
        {
            for(int j = 0; j<transpuesta[i].length; j++)
            {
                System.out.println(this.transpuesta[i][j]+" ");

            } 
            System.out.println();
        }
    }


    
    public static void main(String[] args)
    {
        MatrizTrans  matriz = new MatrizTrans();

        matriz.tamañoMatriz();
        matriz.agregarMatriz();
        matriz.mostrarMatriz();
        matriz.transMatriz();
        matriz.mostrarTrans();
        

    }


    

    



    
}
