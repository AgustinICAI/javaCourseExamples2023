import java.awt.*;
import javax.swing.JFrame;

/** 
	Facilita la representación gráfica de objetos creados por el alumno mediante una ventana gráfica y un lienzo 
*/
public class Dibujo extends JFrame
{
	private Lienzo lienzo;
  final static int X = 800;
  final static int Y = 600;

	public Dibujo()
	{
		super("Dibujo");
		lienzo = new Lienzo();
		lienzo.setSize(X,Y);
		this.add(lienzo);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/** 
		Pinta el cuadrado recibido por el App y actualiza el lienzo (canvas) 
		@param cuadrado cuadrado a pintar
	*/
	public void pintar(Cuadrado cuadrado)
	{
		lienzo.pintar(cuadrado);
		lienzo.repaint();
	}

}
