package ch05;

		public class SafeArray {//������ �迭�� ����� Ŭ����
			private int[] a;
			public int length;//���θ޼ҵ忡�� �迭�� ���̸� ����� ���̱� ������ public���� �����ߴ�.
			//*�ʵ忡�� ���� �ϰ� �Ҵ��� �޼ҵ�� �Ѵ�. �װ� ���������� ���ؼ� ����.
			public void SafeArray(int size) {//�迭�� ���̸� ���ϰ� 
				a=new int[size];
				this.length=size;//public int ���� length���� �ִµ�(���θ޼ҵ忡���� ��ü�̸�.�迭�̸�.length()�� �� ���� ������(private�޼ҵ��)
			}

			public int get(int index) {//����ڰ� �迭�� ã����(������ ��)����ϴ� �޼ҵ�
				if(index>=0&&index<length)//������ ����(0~length-1)�� index�� ���� ���� �� �ִ�.
				{return a[index];}
				return 0;
			}

			public void put(int index, int value) {//����ڰ� �迭�� ���� �Է��� �� index���� value�� �Է��Ѵ�.
				if(index>=0&&index<length)//��get�޼ҵ�� ���������� ���� ������ index���� �Է��� �� �ִ�.
					a[index]=value;
				else
					System.out.println(index+"�� �߸��� �����Դϴ�.");
			}
			public static void main(String[] args) {
				SafeArray sa=new SafeArray();
				sa.SafeArray(5);
				for(int i=0;i<sa.length+1;i++) {//�Ϻη� sa.length+1�̶�� �����ؼ� put�޼ҵ� �κ��� else �κ��� ���(index+"�� �߸��� �����Դϴ�)�ϰԲ� �ߴ�.
					sa.put(i,i*10);
				}
				for(int i=0;i<sa.length;i++) {//�迭�� ��� ���� ��¹޴´�.
					System.out.println(sa.get(i));
				}
			}

		}




