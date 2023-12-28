function omikuji() {
	jikoku = new Date();
	var byou = jikoku.getSeconds();
	byou %= 10;
	var bun = new Array();
	bun[0] = "大吉！<br>絶好調です。何もかも貴方の思い通り！";
	bun[1] = "中吉！<br>何か良いことがありそう。";
	bun[2] = "吉。<br>穏やかな日々が過ごせそうです。";
	bun[3] = "小吉。<br>今日はゆっくりと過ごしましょう。";
	bun[4] = "凶…<br>忘れ物に注意！";
	bun[5] = "大凶…<br>ミスを連発しそうです。";
	bun[6] = "中吉。<br>懐かしい人に出会えそう。";
	bun[7] = "小吉。<br>残り物には福がある。";
	bun[8] = "凶…<br>こんな日は大人しくしていよう。";
	bun[9] = "吉。<br>懐かしい人に連絡を取ってみよう。";

	document.open();
	document.write('<html><body><center><font size="5">' + bun[byou]);
	document.write('<br><br>');
	document.write('<a href="omikuji">戻る</a></font></center>');
	document.write('</body></html>');
	document.close();
} 