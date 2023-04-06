import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;


public class Taller1 {
    public static void main(String[] args) {
        //Rango del dibujo

        double min = -1.0;
        double max = 1.0;
        //Definicion de la escala del dibujo

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        //Evita los parpadeos en la pantalla

        StdDraw.enableDoubleBuffering();
        //Posicion inicial
        double x0 = min + (max-min) * Math.random();
        double y0 = min + (max-min) * Math.random();
        
        double x1 = min + (max-min) * Math.random();
        double y1 = min + (max-min) * Math.random();
        //Velocidad inicial
        double vx =0.12 + (0.5-0.12) * Math.random();;
        double vy = 0.12 + (0.5-0.12) * Math.random();;


        //Ciclo infinito

        while (true){

            //Colision
            if (Math.abs(x0+vx) > 1.0 ){
                vx = -vx;
            }

            if (Math.abs(y0+vy) > 1.0 ){
                vy = -vy;
            }
            if (Math.abs(x1+vx) > 1.0 ){
                vx = -vx;
            }

            if (Math.abs(y1+vy) > 1.0 ){
                vy = -vy;
            }
            //Actualizacion de la posicion
            x0+=vx;
            y0+=vy;
            x1+=vx;
            y1+=vy;

            //Limpiar el fondo
            StdDraw.clear();

            //Color linea
            StdDraw.setPenColor(Color.BLACK);
            //Dibujar linea
            StdDraw.line(x0, y0, x1, y1);

            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x0-0.1,y0-0.1,x1-0.1,y1-0.1);

            StdDraw.setPenColor(Color.RED);
            StdDraw.line(x0-0.2,y0-0.2,x1-0.2,y1-0.2);

            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(x0-0.3,y0-0.3,x1-0.3,y1-0.3);

            StdDraw.setPenColor(Color.YELLOW);
            StdDraw.line(x0-0.4,y0-0.4,x1-0.4,y1-0.4);

            StdDraw.setPenColor(Color.ORANGE);
            StdDraw.line(x0-0.5,y0-0.5,x1-0.5,y1-0.5);
            //Mostrar la pantalla
            StdDraw.show();
            StdDraw.pause(200);
        }




    }




}

