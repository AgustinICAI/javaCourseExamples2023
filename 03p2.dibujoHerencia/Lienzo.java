import java.awt.*;
import javax.swing.JFrame;

public class Lienzo extends Canvas
{
	Cuadrado cuadrados[] = new Cuadrado[10];
	static int NUM = 0;

	void addCuadrado(Cuadrado c)
	{
		for(int i=0;i<cuadrados.length;i++)
			if(cuadrados[i]==null)
			{
				cuadrados[i] = c;
				i=cuadrados.length;
			}
	}

	public void paint(Graphics g)
	{
		for(Figura figura:figuras)
			if(figura!=null)
        figura.pintar(g);
			
	}
}
