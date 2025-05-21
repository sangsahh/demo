package com.example.demo.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // 正常
    OK(100, "00", "正常", "200", "正常終了"),

    // データなし
    NO_DATA(101, "01", "データなし", "200", "取得データが存在しません。"),

    // DBエラー
    DB_ERROR(102, "02", "DBアクセスエラー", "200", "DBアクセス中にエラーが発生しました。"),

    // パラメータエラー
    PARAM_ERROR(300, "03", "パラメータエラー", "400", "リクエストパラメータが不正です。"),
    JSON_PARSE_ERROR(301, "03", "JSONパースエラー", "400", "JSONフォーマットが不正です。"),

    // 認証エラー
    AUTH_FAIL(401, "04", "認証失敗", "401", "認証に失敗しました。"),
    PASSWORD_CHANGED(402, "04", "パスワード変更", "401", "パスワードが変更されました。"),

    // サーバーエラー
    SERVER_ERROR(501, "05", "システムエラー", "500", "サーバー内部エラーが発生しました。"),

    // バリデーションエラー
    VALIDATION_ERROR(103, "06", "バリデーションエラー", "400", "入力値が正しくありません。"),

    // ログイン失敗（IDまたはパスワード不一致）
    LOGIN_FAILED(104, "04", "IDまたはパスワード不一致", "401", "IDまたはパスワードが間違っています。"),

    // チェックインエラー（予約時間前）
    CHECKIN_ERROR(302, "06", "チェックイン時間エラー", "200", "まだチェックインできません。");

    private final int code;
    private final String returnCode;
    private final String resultCodeDesc;
    private final String httpStatus;
    private final String message;
}
