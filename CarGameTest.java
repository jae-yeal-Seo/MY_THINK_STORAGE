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
	BufferedImage img = null;//BufferedImage라는 타입변수의 초기화?
	int img_x = 100, img_y = 100;

	public MyPanel() {//생성자
		try {
			img = ImageIO.read(new File("C:\\Users\\woduf\\OneDrive - Avanti Gardens\\Desktop\\멀티미디어\\이미지 소스\\몬스터\\코딩몬 이름표.png"));
			//imageIO의 뜻 : 이미지 입출력. 그리고 read는 정적메소드이다. 클래스 수준에서 접근했으니까.
		} catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		//		입출력예외(파일을 불러올 수 없거나 접근할 수 없음)가 발생하면 catch문을 실행한다.
		addKeyListener(new KeyListener() {
			//		키를 누를 시에 KeyListener라는 이벤트를 발생시킨다. KeyEvent는 import해야 쓸 수 있는 애다. 
			//		당연히 그럴 수 밖에 없는게 우리가 구현한 적이 없으니까. addKeyListner도 extends Panel을 했기때문에 Panel의 메소드를 사용할 수 있는 것이다.
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
			//			당연히 KeyEvent도 import 해야 되는 개념이다. 우리가 구현한 적이 없는 클래스이기 때문이다. 
			//			import 해야 되는 클래스인지, 우리가 맘대로 이름을 정할 수 있는 클래스인지 구분하는 것은 굉장히 중요하다. 
		});
		this.requestFocus();
		//		키 이벤트를 받을 컴포넌트를 강제로 설정한다. 여기서는 패널에 강제로 이벤트를 받는다.
		setFocusable(true);
		//		패널이 포커스를 받을 수 있게 한다
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//		부모(MyPanel)가 paintComponent라는 메소드를 통해 그림을 그리게 한다.
		g.drawImage(img, img_x,img_y,null);
		//		g의 그림을 구체적으로 그린다.
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
