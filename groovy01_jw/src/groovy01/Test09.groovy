package groovy01


// 자바스크립트의 each() 흉내
// each(배열, funtion(index,item){
// });

scores = ["홍길동", 100, 80, 100]

//scores.each({println "오호라"})
scores.each {value -> println value}

/*scores.each {
	value -> println value
}*/
// 메서드 호출할 때 괄호를 생략할 수 있다.


//scores.eachWithIndex({value, index -> println value + ","+ index})
// == scores.eachWithIndex({v, i -> println v + ","+ i})



println "-------Method Define----"
//메서드 정의
def plus(x, y){
	x + y // 맨 끝의 문장의 실행 결과가 리턴된다.
}

int minus(int x, int y){
	return x - y;
}

println(plus(10, 20)) // 메서드 호출 시 괄호 사용 : Java의 고유문법
println plus(100, 200) // 메서드 호출 시 괄호 생략 : 그루비 기본 문법
result = minus 100, 50 // 괄호 생략 예제
println result

println "-------Closure Define-------"
//클로저 정의
multiple = {x, y -> x * y}
result = multiple 30, 20
println result

println multiple (30, 20);

multiple = {x, y ->
	println "이것이 클로저다!"
	println "오호라 그렇군"
	x * y
}

println multiple (30, 20);
// 자바 스크립트로 위의 문장을 표현한다면,
/*multiple = function(x, y){
	console.log("이것이 클로저다!")
	console.log("오호라 그렇군")
	return x * y;
}*/