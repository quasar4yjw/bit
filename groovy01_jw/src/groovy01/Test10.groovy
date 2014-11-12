package groovy01


// 문자열 다루기
println "BIT's lecture"
println 'BIT"s lecture'
println 'BIT\'s lecture'
println "BIT\"s lecture"

println (/BIT's "ok" lecture/)

println """ 오호라..
정말이네..
헐...
자바에서는 + 연산자를 사용해야 했는데..
끝내주네...
"""

// 포매팅 문자열 다루기(흉내내기) => GString
name = "홍길동"
println "안녕하세요. $name 님 반갑습니다."
println "안녕하세요. \$name 님 반갑습니다."

//문자열 중간에 클로저 넣기 ${마지막 문장:리턴값}
println "2 + 3의 결과는 ${println '헐...';2 + 3}입니다."
println "2 + 3의 결과는 ${println "헐...";2 + 3}입니다."
