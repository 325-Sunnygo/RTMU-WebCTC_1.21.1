# RTMU-WebCTC_1.21.1

WebCTC の 1.21.1 移植バージョン。**NeoForge / Fabric 両対応**。

サーバー起動時に Web サーバー (既定 `:8080`、`-Dwebctc.port=` で変更) を立ち上げ、
ブラウザから列車・レール・信号の閲覧と列車操作ができます。

## 構成

| 場所 | 中身 |
|---|---|
| `src/` | NeoForge 版 |
| `fabric/src/` | Fabric 版 |

Fabric 版は入口クラス (`org.webctc.fabric.*`) だけが別で、それ以外のコードは共通です。

## 導入

[RTMU 本体](https://github.com/325-Sunnygo/RealTrainModUnofficial) が必要です。
本体と同じ `mods` フォルダへ入れてください。

## ビルド

**このリポジトリ単体ではビルドできません。** RTMU 本体のクラスを `compileOnly rootProject`
で参照しているためです。RTMU 本体を clone し、その `webctc/` サブプロジェクトとして置いてください
(Fabric 版は RTMU の Fabric ツリー側の `webctc/`)。

## Credits

All original design and code © the WebCTC authors (**Kaiz_JP**, **masa0300**).
This port preserves the original **AGPL-3.0** license and author attribution.

1.21.1 への移植: 325-Sunnygo
