# Youtube
[![ConstraintLayout sample](https://img.youtube.com/vi/PQgsIO1tfKw/0.jpg)](https://www.youtube.com/watch?v=PQgsIO1tfKw)

# 概要
* ConstraintLayout に layout_constraintWidth_min="wrap" を指定したサンプル。

# 使用ライブラリ
* androidx.constraintlayout:constraintlayout:1.1.3

# デザイン概要
* TextView(width=wrap)、ViewGroup。
* ViewGroup の中に ImageView(例) を２つ配置。
* TextView 横幅はセットされたテキスト長によって変化する。
* ViewGroup 横幅は、TextView 横幅に連動して変化する。

# ポイント
* TextView のテキスト長が大きくなっても、ImageView が正しく表示できるか。
