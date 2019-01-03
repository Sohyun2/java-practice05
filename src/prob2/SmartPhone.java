package prob2;

public class SmartPhone extends MusicPhone {
	public void execute(String function) {
		if(function.equals("앱")) {
			startApp();
		} else if(function.equals("음악")) {
			downloadMusic();
		} else {
			super.execute(function);
		}
	}
	
	private void downloadMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	private void startApp() {
		System.out.println("앱 실행");
	}
	
}
