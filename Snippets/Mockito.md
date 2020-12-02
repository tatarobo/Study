# Mockito

* github : https://github.com/mockito/mockito
* document : https://javadoc.io/static/org.mockito/mockito-core/3.6.28/org/mockito/Mockito.html

### @RunWith(MockitoJUnitRunner.class)
- MockitoAnnotations.initMocks() 를 호출할 필요가 없다.

### Mockito.verfiy()
* 해당 메소드의 수행 여부를 확인한다.
* Mockito.when()으로 설정하지 않아도 된다.
	* 이상한게, when()으로 설정하지 않은 메소드는 호출 시점에 해당 메소드에서 NullPointerException이 발생했던것 같다.
	* 왜 안나는거지?
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE2OTI1MDE0ODFdfQ==
-->