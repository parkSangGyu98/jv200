package com.varxyz.jv200.mod9;

public class Library {
	   private static int leng = 100;
	   private static Book[] bookArray = new Book[leng];
	   private static Book bookInfo;
	   
	   private static void Library() {} //도서관 생성자 생성
	   
	   // 사용자로부터 시리얼번호를 받아 책정보를 출력해주는 메소드
	   public static void getBook(int serial) {
	      for (int i = 0; i < bookArray.length; i++) {
	         if( bookArray[i] == null) {
	            System.err.println("\n잘못 된 시리얼 번호를 입력하셨습니다.");
	            break;
	         }
	         else if ( serial == bookArray[i].getSerial() ) {
	            System.out.println("book name : " + bookArray[i].getName()
	            		+ "\nbook serial : " + bookArray[i].getSerial()+"\n");
	            break;
	         }
	      }
	   }
	   // Libary bookArray에 Book객체를 넣어주는 메소드
	   public static Book addBook(Book book) {
	      // bookArray 배열에 값이 할당되지 않았을때는 default값으로 null값이 할당된다.
	      for (int i = 0; i < bookArray.length; i++) {
	         if (bookArray[i] == null) { //배열에 값이 비어있다면
	            bookArray[i] = book;
	            break;
	         //bookArray에 공간이 꽉차면 2배로 공간을 늘려준다.
	         }
	         else if(bookArray[i] != null) { //배열에 값이 꽉 차있다면
	            leng = leng*2;
	         }
	      }
	      return book;
	   }
	   

	   public Book getBookInfo() {
	      return bookInfo;
	   }

	   public void setBookInfo(Book bookInfo) {
	      Library.bookInfo = bookInfo;
	   }

	}
