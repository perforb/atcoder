package jp.atcoder.ABC049C;

import java.util.List;
import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abs/tasks/arc065_a"
 * @see "https://atcoder.jp/contests/abs/submissions/15408375"
 * @see "https://atcoder.jp/contests/abs/submissions/12814555"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    // 先に er で始まる単語を消す必要がある.
    // 例えば dreameraserdreamerase の場合に dreamer を先に消すと aserase となってしまう.
    // また, erase を先に消すと dreamrdream となってしまう.
    // そのため, eraser, erase, dreamer, dream の順に消す必要がある.
    var words = List.of("eraser", "erase", "dreamer", "dream");
    for (String word : words) {
      S = S.replace(word, ""); // 一致した単語がすべて消える
    }
    System.out.println(S.isEmpty() ? "YES" : "NO");
  }
}
