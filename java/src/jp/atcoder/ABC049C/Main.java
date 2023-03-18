package jp.atcoder.ABC049C;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abs/tasks/arc065_a"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    // 与えられた文字列を特定の順序に従って単語を消した結果, 空文字列であれば一致したものと見なす.
    // 例えば dreameraserdreamerase の場合に dreamer を先に消すと aserase となってしまう.
    // また, erase を先に消すと dreamrdream となってしまう.
    // そのため, eraser, erase, dreamer, dream の順に消す必要がある.
    List<String> words = Arrays.asList("eraser", "erase", "dreamer", "dream");
    for (String word : words) {
      S = S.replace(word, ""); // 一致した単語をすべて空文字列に置換
    }
    System.out.println(S.isEmpty() ? "YES" : "NO");
  }
}
