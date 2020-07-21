package kr.or.test;

class MovieThread extends Thread{
	@Override
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {	
			System.out.println("동영상을 재생합니다.");
		}
		while(true) {
			System.out.println("동영상을 무한재생합니다.");
			/*try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				break;
			}*/
			//스레드-실행중인클래스가 main()에서 interrupt()가 호출
			if(Thread.interrupted()) {
				System.out.println("인터럽트가 발생 되었습니다. 반복문을종료합니다.");
				break;
			}
		}
	}
}
class MusicRunnalbe  implements Runnable {
	
	@Override
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {	
			System.out.println("음악을 재생합니다.");
			
		}
	}	
}
public class ThreadUser {

	public static void main(String[] args) {
		Thread threadMovie = new MovieThread(); //초기값을 MovieThread에서 가져옴
		threadMovie.setDaemon(true);//백그라운드로 실행설정
		threadMovie.start(); //main스레드는 1초간 중지상태
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {			
		} 
		threadMovie.interrupt();
		
		
		Thread threadMusic = new Thread(new MusicRunnalbe());
		threadMusic.start();
		
	}
}
