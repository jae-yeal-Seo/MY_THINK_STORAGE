import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	BufferedImage img = null;//BufferedImage��� Ÿ�Ժ����� �ʱ�ȭ?
	int img_x = 100, img_y = 100;

	public MyPanel() {//������
		try {
			img = ImageIO.read(new File("C:\\Users\\woduf\\OneDrive - Avanti Gardens\\Desktop\\��Ƽ�̵��\\�̹��� �ҽ�\\����\\�ڵ��� �̸�ǥ.png"));
			//imageIO�� �� : �̹��� �����. �׸��� read�� �����޼ҵ��̴�. Ŭ���� ���ؿ��� ���������ϱ�.
		} catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		//		����¿���(������ �ҷ��� �� ���ų� ������ �� ����)�� �߻��ϸ� catch���� �����Ѵ�.
		addKeyListener(new KeyListener() {
			//		Ű�� ���� �ÿ� KeyListener��� �̺�Ʈ�� �߻���Ų��. KeyEvent�� import�ؾ� �� �� �ִ� �ִ�. 
			//		�翬�� �׷� �� �ۿ� ���°� �츮�� ������ ���� �����ϱ�. addKeyListner�� extends Panel�� �߱⶧���� Panel�� �޼ҵ带 ����� �� �ִ� ���̴�.
			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP: img_y -=10; break;
				case KeyEvent.VK_DOWN: img_y +=10; break;
				case KeyEvent.VK_LEFT: img_x -=10; break;
				case KeyEvent.VK_RIGHT: img_x +=10; break;
				}
				repaint();
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
			//			�翬�� KeyEvent�� import �ؾ� �Ǵ� �����̴�. �츮�� ������ ���� ���� Ŭ�����̱� �����̴�. 
			//			import �ؾ� �Ǵ� Ŭ��������, �츮�� ����� �̸��� ���� �� �ִ� Ŭ�������� �����ϴ� ���� ������ �߿��ϴ�. 
		});
		this.requestFocus();
		//		Ű �̺�Ʈ�� ���� ������Ʈ�� ������ �����Ѵ�. ���⼭�� �гο� ������ �̺�Ʈ�� �޴´�.
		setFocusable(true);
		//		�г��� ��Ŀ���� ���� �� �ְ� �Ѵ�
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//		�θ�(MyPanel)�� paintComponent��� �޼ҵ带 ���� �׸��� �׸��� �Ѵ�.
		g.drawImage(img, img_x,img_y,null);
		//		g�� �׸��� ��ü������ �׸���.
	}
}
public class CarGameTest extends JFrame {
	public CarGameTest() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args){
		new CarGameTest();
	}
}
