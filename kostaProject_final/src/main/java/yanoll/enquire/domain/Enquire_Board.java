package yanoll.enquire.domain;

import java.util.Date;

public class Enquire_Board {
	
	private int e_seq;
	private String e_title;
	private String e_contents;
	private String e_writer;
	private Date e_date;
	private int user_no;
	
	public int getE_seq() {
		return e_seq;
	}
	public void setE_seq(int e_seq) {
		this.e_seq = e_seq;
	}
	public String getE_title() {
		return e_title;
	}
	public void setE_title(String e_title) {
		this.e_title = e_title;
	}
	public String getE_contents() {
		return e_contents;
	}
	public void setE_contents(String e_contents) {
		this.e_contents = e_contents;
	}
	public String getE_writer() {
		return e_writer;
	}
	public void setE_writer(String e_writer) {
		this.e_writer = e_writer;
	}
	public Date getE_date() {
		return e_date;
	}
	public void setE_date(Date e_date) {
		this.e_date = e_date;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public Enquire_Board() {
		
	}
	public Enquire_Board(int e_seq, String e_title, String e_contents, String e_writer, Date e_date, int user_no) {
		super();
		this.e_seq = e_seq;
		this.e_title = e_title;
		this.e_contents = e_contents;
		this.e_writer = e_writer;
		this.e_date = e_date;
		this.user_no = user_no;
	}
	@Override
	public String toString() {
		return "enquire_board [e_seq=" + e_seq + ", e_title=" + e_title + ", e_contents=" + e_contents + ", e_writer="
				+ e_writer + ", e_date=" + e_date + ", user_no=" + user_no + "]";
	}
	
	
	/*create table enquire_board(
			e_seq number PRIMARY KEY,
			e_title varchar2(150),
			e_contents varchar2(1500),
			e_date date,
			e_writer varchar2(50),
			user_no number
			);*/
	
	

}
