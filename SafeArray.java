package ch05;

		public class SafeArray {//안전한 배열을 만드는 클래스
			private int[] a;
			public int length;//메인메소드에서 배열의 길이를 사용할 것이기 때문에 public으로 설정했다.
			//*필드에선 선언만 하고 할당은 메소드로 한다. 그게 정보은닉을 위해서 좋다.
			public void SafeArray(int size) {//배열의 길이를 정하고 
				a=new int[size];
				this.length=size;//public int 값인 length값에 넣는데(메인메소드에서는 객체이름.배열이름.length()로 못 쓰기 때문에(private메소드라서)
			}

			public int get(int index) {//사용자가 배열을 찾을때(접근할 때)사용하는 메소드
				if(index>=0&&index<length)//★허용된 범위(0~length-1)의 index만 값을 넣을 수 있다.
				{return a[index];}
				return 0;
			}

			public void put(int index, int value) {//사용자가 배열의 값을 입력할 때 index값과 value를 입력한다.
				if(index>=0&&index<length)//★get메소드와 마찬가지로 허용된 범위의 index값만 입력할 수 있다.
					a[index]=value;
				else
					System.out.println(index+"는 잘못된 설정입니다.");
			}
			public static void main(String[] args) {
				SafeArray sa=new SafeArray();
				sa.SafeArray(5);
				for(int i=0;i<sa.length+1;i++) {//일부러 sa.length+1이라고 설정해서 put메소드 부분의 else 부분을 출력(index+"는 잘못된 설정입니다)하게끔 했다.
					sa.put(i,i*10);
				}
				for(int i=0;i<sa.length;i++) {//배열의 모든 값을 출력받는다.
					System.out.println(sa.get(i));
				}
			}

		}




