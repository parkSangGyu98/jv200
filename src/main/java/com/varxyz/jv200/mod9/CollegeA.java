package com.varxyz.jv200.mod9;

public class CollegeA {
	   /**
	    * 대학의 모든 정보는 하나의 도서관(저장소)에 보관 및 등록된다고 가정하자.
	    * 각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다고 가정하자.
	    * 책을 대출할 때 고유번호(serial)를 통해 검색되어 대출된다고 가정하자.
	    * 도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로 이전 저장소 크기의
	    * 2배로 증가된다고 가정하자.
	    * 
	    * 도서관 = Libary
	    * 책 = Book
	    * 책정보 등록 = addBook(Book book)
	    * 책 대출 = getBook(int serial)
	    */
	
	   public static void main(String[] args) {
	      Book theLittlePrince = new Book(616, "어린왕자");
	      Book demian = new Book(617, "데미안");
	      Book coding = new Book(618, "코딩");
 
	      Library.addBook(theLittlePrince);
	      Library.addBook(demian);
	      Library.addBook(coding);
	      
	      Library.getBook(616);
	      Library.getBook(617);
	      Library.getBook(1);
	      
	      }
}
