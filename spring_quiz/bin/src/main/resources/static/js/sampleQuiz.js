/**
 * 
 */
//問題と解答
qa = new Array();
qa[0] = ["イルカを漢字で書くとどれ？","海豚","海牛","河豚",1];
qa[1] = ["クラゲを漢字で書くとどれ？","水浮","水母","水星",2];
qa[2] = ["カタツムリを漢字で書くとどれ？","禍牛","鍋牛","蝸牛",3];
qa[3] = ["バッタを漢字で書くとどれ？","飛蝗","飛蟻","飛脚",1];
qa[4] = ["タツノオトシゴを英語にするとどれ？","sea fish","sea horse","sea dragon",2];
qa[5] = ["マグロを英語にするとどれ？","funa","suna","tuna",3];
qa[6] = ["トンボを英語にするとどれ？","fly","dragonfly","butterfly",2];
qa[7] = ["ヒトデを英語にするとどれ？","starfish","starshell","starmine",1];
qa[8] = ["恒星の中で最も明るい星は？","デネブ","スピカ","シリウス",3];
qa[9] = ["惑星の中で最も重たいのはどれ？","太陽","木星","天王星",2];

//初期設定
count = 0; //問題番号
q_sel = 3; //選択肢の数

//最初の問題
quiz();

//問題表示
function quiz() {
	var s, n;
	//問題
	document.getElementById("text_q").innerHTML = (count + 1) + "問目：" + qa[count][0];
	//選択肢
	s = "";
	for (n=1;n<=q_sel;n++) {
		s += "【<a href='javascript:anser(" + n + ")'>" + n + "：" + qa[count][n] + "</a>】";
	}
	document.getElementById("text_s").innerHTML = s;
}

//解答表示
function anser(num) {
	var s;
	s = (count + 1) + "問目：";
	//答え合わせ
	if (num == qa[count][q_sel + 1]) {
		//正解
		s += "○" + qa[count][num];
	} else {
		s += "×" + qa[count][num];
	}
	document.getElementById("text_a").innerHTML = s;
	
	//次の問題を表示
	count++;
	if (count < qa.length) {
		quiz();
	} else {
		//終了
		document.getElementById("text_q").innerHTML = "";
		document.getElementById("text_s").innerHTML = "";
	}
	
}