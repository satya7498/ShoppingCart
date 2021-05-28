package cart.Model;

public class UserInfo {
	
		private String userName;
		private int mobNo;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getMobNo() {
			return mobNo;
		}
		public void setMobNo(int mobNo) {
			this.mobNo = mobNo;
		}
		@Override
		public String toString() {
			return "userName=" + userName + ", mobNo=" + mobNo ;
		}
		public  UserInfo(String userName, int mobNo) {
			super();
			this.userName = userName;
			this.mobNo = mobNo;
		}
		

}
