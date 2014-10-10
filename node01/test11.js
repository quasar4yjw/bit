/* GET 요청과 POST 요청 구분하기
 - request.method 프로퍼티의 값을 확인하라!
 */

http.createServer(function handler(req, res) {
	

	if (req.method == 'GET'){
		console.log('get요청')
	}
	else if(req.method =='POST') {
		console.log('post요청')
	}
    res.end();
}).listen(1337, 'localhost');
console.log('Server running at http://127.0.0.1:1337/');
