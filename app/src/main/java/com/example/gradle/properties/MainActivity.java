package com.example.gradle.properties;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView tvValue = findViewById(R.id.tv_value);
    tvValue.setText(config());
  }

  private String config() {
    return "DYNAMIC_VALUE:" + BuildConfig.DYNAMIC_VALUE
            + "\n" + "FORCE_DISABLE_LEAK_CANARY:" + BuildConfig.FORCE_DISABLE_LEAK_CANARY
            + "\n" + "MAVEN_URL:" + BuildConfig.MAVEN_URL;
  }
}
