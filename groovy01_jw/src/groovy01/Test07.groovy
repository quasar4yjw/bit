package groovy01

// 조건문
/*
age = 20

if (age > 18) {
	println "성인"
} else {
	println "청소년"
}
*/
//age = "A" // ASCII code '3' => 33
age = "10"

// 조건 연산자 : (조건) ? A : B
println age > 18 ? "성인" : "청소년"

println "----------------------------------------"
// switch => 숫자, 문자열, 논리, 객체

x = 3.15f
result = ""

switch (x) {
case "aaa": println "aaa이다"; break
case "123": println "123은 아니지만 break 가 없어서 실행"	
case [1, 20, "홍길동", true, 3.14f]: 
println "헐 자바에서 불가능!"
break
}

