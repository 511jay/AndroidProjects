package com.jhlee.spell_checker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int top_lvl;
    int jungle_lvl;
    int mid_lvl;
    int ad_lvl;
    int sup_lvl;

    boolean top_foot;
    boolean jungle_foot;
    boolean mid_foot;
    boolean ad_foot;
    boolean sup_foot;

    int top_spell1_time;
    int jungle_spell1_time;
    int mid_spell1_time;
    int ad_spell1_time;
    int sup_spell1_time;

    int top_spell1_time_save;
    int jungle_spell1_time_save;
    int mid_spell1_time_save;
    int ad_spell1_time_save;
    int sup_spell1_time_save;

    int top_spell2_time;
    int jungle_spell2_time;
    int mid_spell2_time;
    int ad_spell2_time;
    int sup_spell2_time;

    int top_spell2_time_save;
    int jungle_spell2_time_save;
    int mid_spell2_time_save;
    int ad_spell2_time_save;
    int sup_spell2_time_save;

    int top_spell1;
    int jungle_spell1;
    int mid_spell1;
    int ad_spell1;
    int sup_spell1;

    int top_spell2;
    int jungle_spell2;
    int mid_spell2;
    int ad_spell2;
    int sup_spell2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_lvl = 1;
        jungle_lvl = 1;
        mid_lvl = 1;
        ad_lvl = 1;
        sup_lvl = 1;

        top_foot = false;
        jungle_foot = false;
        mid_foot = false;
        ad_foot = false;
        sup_foot = false;

        top_spell1_time = 1;
        jungle_spell1_time = 1;
        mid_spell1_time = 1;
        ad_spell1_time = 1;
        sup_spell1_time = 1;

        top_spell2_time = 1;
        jungle_spell2_time = 1;
        mid_spell2_time = 1;
        ad_spell2_time = 1;
        sup_spell2_time = 1;

        top_spell1_time_save = 1;
        jungle_spell1_time_save = 1;
        mid_spell1_time_save = 1;
        ad_spell1_time_save = 1;
        sup_spell1_time_save = 1;

        top_spell2_time_save = 1;
        jungle_spell2_time_save = 1;
        mid_spell2_time_save = 1;
        ad_spell2_time_save = 1;
        sup_spell2_time_save = 1;

        top_spell1 = 0;
        jungle_spell1 = 0;
        mid_spell1 = 0;
        ad_spell1 = 0;
        sup_spell1 = 0;

        top_spell2 = 0;
        jungle_spell2 = 0;
        mid_spell2 = 0;
        ad_spell2 = 0;
        sup_spell2 = 0;

        final ImageButton top_champ_button = (ImageButton)findViewById(R.id.top_champ);
        final ImageButton jungle_champ_button = (ImageButton)findViewById(R.id.jungle_champ);
        final ImageButton mid_champ_button = (ImageButton)findViewById(R.id.mid_champ);
        final ImageButton ad_champ_button = (ImageButton)findViewById(R.id.ad_champ);
        final ImageButton sup_champ_button = (ImageButton)findViewById(R.id.sup_champ);

        top_champ_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickChampion(v, top_champ_button);
            }
        });
        jungle_champ_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickChampion(v, jungle_champ_button);
            }
        });
        mid_champ_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickChampion(v, mid_champ_button);
            }
        });
        ad_champ_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickChampion(v, ad_champ_button);
            }
        });
        sup_champ_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickChampion(v, sup_champ_button);
            }
        });

        final ImageButton top_spell1_button = (ImageButton)findViewById(R.id.top_spell1);
        final ImageButton jungle_spell1_button = (ImageButton)findViewById(R.id.jungle_spell1);
        final ImageButton mid_spell1_button = (ImageButton)findViewById(R.id.mid_spell1);
        final ImageButton ad_spell1_button = (ImageButton)findViewById(R.id.ad_spell1);
        final ImageButton sup_spell1_button = (ImageButton)findViewById(R.id.sup_spell1);

        final TextView top_time1 = (TextView)findViewById(R.id.top_spell1_time);
        final TextView jungle_time1 = (TextView)findViewById(R.id.jungle_spell1_time);
        final TextView mid_time1 = (TextView)findViewById(R.id.mid_spell1_time);
        final TextView ad_time1 = (TextView)findViewById(R.id.ad_spell1_time);
        final TextView sup_time1 = (TextView)findViewById(R.id.sup_spell1_time);

        top_spell1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickTopSpell1(v, top_spell1_button, top_time1);
            }
        });

        jungle_spell1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickJungleSpell1(v, jungle_spell1_button, jungle_time1);
            }
        });

        mid_spell1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMidSpell1(v, mid_spell1_button, mid_time1);
            }
        });

        ad_spell1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickAdSpell1(v, ad_spell1_button, ad_time1);
            }
        });

        sup_spell1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickSupSpell1(v, sup_spell1_button, sup_time1);
            }
        });

        final Button top_time_start_button1 = (Button)findViewById(R.id.top_spell1_time_start);
        final Button jungle_time_start_button1 = (Button)findViewById(R.id.jungle_spell1_time_start);
        final Button mid_time_start_button1 = (Button)findViewById(R.id.mid_spell1_time_start);
        final Button ad_time_start_button1 = (Button)findViewById(R.id.ad_spell1_time_start);
        final Button sup_time_start_button1 = (Button)findViewById(R.id.sup_spell1_time_start);

        top_time_start_button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(top_spell1 == 2){
                    int temp4 = top_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    top_spell1_time = top_spell1_time_save - temp;
                }
                if(top_foot){
                    top_spell1_time = ((top_spell1_time_save*100)-(top_spell1_time_save*9))/100;
                }
                top_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(top_spell1_time>0){
                            String str = "";
                            top_spell1_time = top_spell1_time-1;
                            top_time1.setText(str+top_spell1_time);
                            handler.postDelayed(this, 1000);
                        }else if(top_spell1_time==0){
                            top_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            top_spell1_time = top_spell1_time_save;
                            String str2 = "ON";
                            top_time1.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        jungle_time_start_button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(jungle_spell1 == 2){
                    int temp4 = jungle_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    jungle_spell1_time = jungle_spell1_time_save - temp;
                }
                if(jungle_foot){
                    jungle_spell1_time = ((jungle_spell1_time_save*100)-(jungle_spell1_time_save*9))/100;
                }
                jungle_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(jungle_spell1_time>0){
                            String str = "";
                            jungle_spell1_time = jungle_spell1_time-1;
                            jungle_time1.setText(str+jungle_spell1_time);
                            handler.postDelayed(this, 1000);
                        }else if(jungle_spell1_time==0){
                            jungle_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            jungle_spell1_time = jungle_spell1_time_save;

                            String str2 = "ON";
                            jungle_time1.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        mid_time_start_button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(mid_spell1 == 2){
                    int temp4 = mid_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    mid_spell1_time = mid_spell1_time_save - temp;
                }
                if(mid_foot){
                       mid_spell1_time = ((mid_spell1_time_save*100)-(mid_spell1_time_save*9))/100;
                }
                mid_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mid_spell1_time>0){
                            String str = "";
                            mid_spell1_time = mid_spell1_time-1;
                            mid_time1.setText(str+mid_spell1_time);
                            handler.postDelayed(this, 1000);
                        }else if(mid_spell1_time==0){
                            mid_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            mid_spell1_time = mid_spell1_time_save;

                            String str2 = "ON";
                            mid_time1.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        ad_time_start_button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(ad_spell1 == 2){
                    int temp4 = ad_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    ad_spell1_time = ad_spell1_time_save - temp;
                }
                if(ad_foot){
                    ad_spell1_time = ((ad_spell1_time_save*100)-(ad_spell1_time_save*9))/100;
                }
                ad_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(ad_spell1_time>0){
                            String str = "";
                            ad_spell1_time = ad_spell1_time-1;
                            ad_time1.setText(str+ad_spell1_time);
                            handler.postDelayed(this, 1000);
                        }else if(ad_spell1_time==0){
                            ad_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            ad_spell1_time = ad_spell1_time_save;
                            String str2 = "ON";
                            ad_time1.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        sup_time_start_button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(sup_spell1 == 2){
                    int temp4 = sup_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    sup_spell1_time = sup_spell1_time_save - temp;
                }
                if(sup_foot){
                    sup_spell1_time = ((sup_spell1_time_save*100)-(sup_spell1_time_save*9))/100;
                }
                sup_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(sup_spell1_time>0){
                            String str = "";
                            sup_spell1_time = sup_spell1_time-1;
                            sup_time1.setText(str+sup_spell1_time);
                            handler.postDelayed(this, 1000);
                        }else if(sup_spell1_time==0){
                            sup_time_start_button1.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            sup_spell1_time = sup_spell1_time_save;
                            String str2 = "ON";
                            sup_time1.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        final ImageButton top_spell2_button = (ImageButton)findViewById(R.id.top_spell2);
        final ImageButton jungle_spell2_button = (ImageButton)findViewById(R.id.jungle_spell2);
        final ImageButton mid_spell2_button = (ImageButton)findViewById(R.id.mid_spell2);
        final ImageButton ad_spell2_button = (ImageButton)findViewById(R.id.ad_spell2);
        final ImageButton sup_spell2_button = (ImageButton)findViewById(R.id.sup_spell2);

        final TextView top_time2 = (TextView)findViewById(R.id.top_spell2_time);
        final TextView jungle_time2 = (TextView)findViewById(R.id.jungle_spell2_time);
        final TextView mid_time2 = (TextView)findViewById(R.id.mid_spell2_time);
        final TextView ad_time2 = (TextView)findViewById(R.id.ad_spell2_time);
        final TextView sup_time2 = (TextView)findViewById(R.id.sup_spell2_time);

        top_spell2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickTopSpell2(v, top_spell2_button, top_time2);
            }
        });

        jungle_spell2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickJungleSpell2(v, jungle_spell2_button, jungle_time2);
            }
        });

        mid_spell2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMidSpell2(v, mid_spell2_button, mid_time2);
            }
        });

        ad_spell2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickAdSpell2(v, ad_spell2_button, ad_time2);
            }
        });

        sup_spell2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickSupSpell2(v, sup_spell2_button, sup_time2);
            }
        });

        final Button top_time_start_button2 = (Button)findViewById(R.id.top_spell2_time_start);
        final Button jungle_time_start_button2 = (Button)findViewById(R.id.jungle_spell2_time_start);
        final Button mid_time_start_button2 = (Button)findViewById(R.id.mid_spell2_time_start);
        final Button ad_time_start_button2 = (Button)findViewById(R.id.ad_spell2_time_start);
        final Button sup_time_start_button2 = (Button)findViewById(R.id.sup_spell2_time_start);

        top_time_start_button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(top_spell2 == 2){
                    int temp4 = top_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    top_spell2_time = top_spell2_time_save - temp;
                }
                if(top_foot){
                    top_spell2_time = ((top_spell2_time_save*100)-(top_spell2_time_save*9))/100;
                }
                top_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(top_spell2_time>0){
                            String str = "";
                            top_spell2_time = top_spell2_time-1;
                            top_time2.setText(str+top_spell2_time);
                            handler.postDelayed(this, 1000);
                        }else if(top_spell2_time==0){
                            top_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            top_spell2_time = top_spell2_time_save;
                            String str2 = "ON";
                            top_time2.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        jungle_time_start_button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(jungle_spell2 == 2){
                    int temp4 = jungle_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    jungle_spell2_time = jungle_spell2_time_save - temp;
                }
                if(jungle_foot){
                    jungle_spell2_time = ((jungle_spell2_time_save*100)-(jungle_spell2_time_save*9))/100;
                }
                jungle_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(jungle_spell2_time>0){
                            String str = "";
                            jungle_spell2_time = jungle_spell2_time-1;
                            jungle_time2.setText(str+jungle_spell2_time);
                            handler.postDelayed(this, 1000);
                        }else if(jungle_spell2_time==0){
                            jungle_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            jungle_spell2_time = jungle_spell2_time_save;
                            String str2 = "ON";
                            jungle_time2.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        mid_time_start_button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(mid_spell2 == 2){
                    int temp4 = mid_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    mid_spell2_time = mid_spell2_time_save - temp;
                }
                if(mid_foot){
                    mid_spell2_time = ((mid_spell2_time_save*100)-(mid_spell2_time_save*9))/100;
                }
                mid_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mid_spell2_time>0){
                            String str = "";
                            mid_spell2_time = mid_spell2_time-1;
                            mid_time2.setText(str+mid_spell2_time);
                            handler.postDelayed(this, 1000);
                        }else if(mid_spell2_time==0){
                            mid_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            mid_spell2_time = mid_spell2_time_save;
                            String str2 = "ON";
                            mid_time2.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        ad_time_start_button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(ad_spell2 == 2){
                    int temp4 = ad_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    ad_spell2_time = ad_spell2_time_save - temp;
                }
                if(ad_foot){
                    ad_spell2_time = ((ad_spell2_time_save*100)-(ad_spell2_time_save*9))/100;
                }
                ad_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(ad_spell2_time>0){
                            String str = "";
                            ad_spell2_time = ad_spell2_time-1;
                            ad_time2.setText(str+ad_spell2_time);
                            handler.postDelayed(this, 1000);
                        }else if(ad_spell2_time==0){
                            ad_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            ad_spell2_time = ad_spell2_time_save;
                            String str2 = "ON";
                            ad_time2.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        sup_time_start_button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onClick(View v) {
                if(sup_spell2 == 2){
                    int temp4 = sup_lvl-1;
                    int temp = temp4/2;
                    int temp2 = temp*10;
                    int temp3 = (temp4-temp)*11;
                    temp = temp2+temp3;
                    sup_spell2_time = sup_spell2_time_save - temp;
                }
                if(sup_foot){
                    sup_spell2_time = ((sup_spell2_time_save*100)-(sup_spell2_time_save*9))/100;
                }
                sup_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(sup_spell2_time>0){
                            String str = "";
                            sup_spell2_time = sup_spell2_time-1;
                            sup_time2.setText(str+sup_spell2_time);
                            handler.postDelayed(this, 1000);
                        }else if(sup_spell2_time==0){
                            sup_time_start_button2.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    return false;
                                }
                            });
                            sup_spell2_time = sup_spell2_time_save;
                            String str2 = "ON";
                            sup_time2.setText(str2);
                        }

                    }
                }, 0);
            }
        });

        final TextView top_level = (TextView)findViewById(R.id.top_level);
        final TextView jungle_level = (TextView)findViewById(R.id.jungle_level);
        final TextView mid_level = (TextView)findViewById(R.id.mid_level);
        final TextView ad_level = (TextView)findViewById(R.id.ad_level);
        final TextView sup_level = (TextView)findViewById(R.id.sup_level);

        Button top_lvl_up_button = (Button)findViewById(R.id.top_level_up);
        Button jungle_lvl_up_button = (Button)findViewById(R.id.jungle_level_up);
        Button mid_lvl_up_button = (Button)findViewById(R.id.mid_level_up);
        Button ad_lvl_up_button = (Button)findViewById(R.id.ad_level_up);
        Button sup_lvl_up_button = (Button)findViewById(R.id.sup_level_up);

        top_lvl_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickTopLevelUp(v, top_level);
            }
        });
        jungle_lvl_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickJungleLevelUp(v, jungle_level);
            }
        });
        mid_lvl_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickMidLevelUp(v, mid_level);
            }
        });
        ad_lvl_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickAdLevelUp(v, ad_level);
            }
        });
        sup_lvl_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickSupLevelUp(v, sup_level);
            }
        });

        Button top_lvl_down_button = (Button)findViewById(R.id.top_level_down);
        Button jungle_lvl_down_button = (Button)findViewById(R.id.jungle_level_down);
        Button mid_lvl_down_button = (Button)findViewById(R.id.mid_level_down);
        Button ad_lvl_down_button = (Button)findViewById(R.id.ad_level_down);
        Button sup_lvl_down_button = (Button)findViewById(R.id.sup_level_down);

        top_lvl_down_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickTopLevelDown(v, top_level);
            }
        });
        jungle_lvl_down_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickJungleLevelDown(v, jungle_level);
            }
        });
        mid_lvl_down_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickMidLevelDown(v, mid_level);
            }
        });
        ad_lvl_down_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickAdLevelDown(v, ad_level);
            }
        });
        sup_lvl_down_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnclickSupLevelDown(v, sup_level);
            }
        });

        final Button top_foot_button = (Button)findViewById(R.id.top_foot_on);
        final Button jungle_foot_button = (Button)findViewById(R.id.jungle_foot_on);
        final Button mid_foot_button = (Button)findViewById(R.id.mid_foot_on);
        final Button ad_foot_button = (Button)findViewById(R.id.ad_foot_on);
        final Button sup_foot_button = (Button)findViewById(R.id.sup_foot_on);

        top_foot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickTopFoot(v, top_foot_button);
            }
        });
        jungle_foot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickJungleFoot(v, jungle_foot_button);
            }
        });
        mid_foot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickMidFoot(v, mid_foot_button);
            }
        });
        ad_foot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickAdFoot(v, ad_foot_button);
            }
        });
        sup_foot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickSupFoot(v, sup_foot_button);
            }
        });
    }

    public void OnClickChampion(View v, final ImageButton i){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] champions = getResources().getStringArray(R.array.Champion);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(champions[0]);
        final int[] champ = {0};
        builder.setTitle("챔피언 선택");
        builder.setSingleChoiceItems(R.array.Champion, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(champions[which]);
                champ[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                switch (champ[0]){
                    case 0:
                        i.setImageResource(R.drawable.garen);
                        break;
                    case 1:
                        i.setImageResource(R.drawable.galio);
                        break;
                    case 2:
                        i.setImageResource(R.drawable.gangplank);
                        break;
                    case 3:
                        i.setImageResource(R.drawable.gragas);
                        break;
                    case 4:
                        i.setImageResource(R.drawable.graves);
                        break;
                    case 5:
                        i.setImageResource(R.drawable.gnar);
                        break;
                    case 6:
                        i.setImageResource(R.drawable.nami);
                        break;
                    case 7:
                        i.setImageResource(R.drawable.nasus);
                        break;
                    case 8:
                        i.setImageResource(R.drawable.nautilus);
                        break;
                    case 9:
                        i.setImageResource(R.drawable.nocturne);
                        break;
                    case 10:
                        i.setImageResource(R.drawable.nunu);
                        break;
                    case 11:
                        i.setImageResource(R.drawable.nidalee);
                        break;
                    case 12:
                        i.setImageResource(R.drawable.neeko);
                        break;
                    case 13:
                        i.setImageResource(R.drawable.darius);
                        break;
                    case 14:
                        i.setImageResource(R.drawable.diana);
                        break;
                    case 15:
                        i.setImageResource(R.drawable.draven);
                        break;
                    case 16:
                        i.setImageResource(R.drawable.ryze);
                        break;
                    case 17:
                        i.setImageResource(R.drawable.rakan);
                        break;
                    case 18:
                        i.setImageResource(R.drawable.rammus);
                        break;
                    case 19:
                        i.setImageResource(R.drawable.lux);
                        break;
                    case 20:
                        i.setImageResource(R.drawable.rumble);
                        break;
                    case 21:
                        i.setImageResource(R.drawable.renekton);
                        break;
                    case 22:
                        i.setImageResource(R.drawable.leona);
                        break;
                    case 23:
                        i.setImageResource(R.drawable.reksai);
                        break;
                    case 24:
                        i.setImageResource(R.drawable.rengar);
                        break;
                    case 25:
                        i.setImageResource(R.drawable.lucian);
                        break;
                    case 26:
                        i.setImageResource(R.drawable.lulu);
                        break;
                    case 27:
                        i.setImageResource(R.drawable.leblanc);
                        break;
                    case 28:
                        i.setImageResource(R.drawable.leesin);
                        break;
                    case 29:
                        i.setImageResource(R.drawable.riven);
                        break;
                    case 30:
                        i.setImageResource(R.drawable.lissandra);
                        break;
                    case 31:
                        i.setImageResource(R.drawable.lillia);
                        break;
                    case 32:
                        i.setImageResource(R.drawable.masteryi);
                        break;
                    case 33:
                        i.setImageResource(R.drawable.maokai);
                        break;
                    case 34:
                        i.setImageResource(R.drawable.malzahar);
                        break;
                    case 35:
                        i.setImageResource(R.drawable.malphite);
                        break;
                    case 36:
                        i.setImageResource(R.drawable.mordekaiser);
                        break;
                    case 37:
                        i.setImageResource(R.drawable.morgana);
                        break;
                    case 38:
                        i.setImageResource(R.drawable.drmundo);
                        break;
                    case 39:
                        i.setImageResource(R.drawable.missfortune);
                        break;
                    case 40:
                        i.setImageResource(R.drawable.bard);
                        break;
                    case 41:
                        i.setImageResource(R.drawable.varus);
                        break;
                    case 42:
                        i.setImageResource(R.drawable.vi);
                        break;
                    case 43:
                        i.setImageResource(R.drawable.veigar);
                        break;
                    case 44:
                        i.setImageResource(R.drawable.vayne);
                        break;
                    case 45:
                        i.setImageResource(R.drawable.velkoz);
                        break;
                    case 46:
                        i.setImageResource(R.drawable.volibear);
                        break;
                    case 47:
                        i.setImageResource(R.drawable.braum);
                        break;
                    case 48:
                        i.setImageResource(R.drawable.brand);
                        break;
                    case 49:
                        i.setImageResource(R.drawable.vladimir);
                        break;
                    case 50:
                        i.setImageResource(R.drawable.blitzcrank);
                        break;
                    case 51:
                        i.setImageResource(R.drawable.viktor);
                        break;
                    case 52:
                        i.setImageResource(R.drawable.poppy);
                        break;
                    case 53:
                        i.setImageResource(R.drawable.samira);
                        break;
                    case 54:
                        i.setImageResource(R.drawable.sion);
                        break;
                    case 55:
                        i.setImageResource(R.drawable.sylas);
                        break;
                    case 56:
                        i.setImageResource(R.drawable.shaco);
                        break;
                    case 57:
                        i.setImageResource(R.drawable.senna);
                        break;
                    case 58:
                        i.setImageResource(R.drawable.seraphine);
                        break;
                    case 59:
                        i.setImageResource(R.drawable.sejuani);
                        break;
                    case 60:
                        i.setImageResource(R.drawable.sett);
                        break;
                    case 61:
                        i.setImageResource(R.drawable.sona);
                        break;
                    case 62:
                        i.setImageResource(R.drawable.soraka);
                        break;
                    case 63:
                        i.setImageResource(R.drawable.shen);
                        break;
                    case 64:
                        i.setImageResource(R.drawable.shyvana);
                        break;
                    case 65:
                        i.setImageResource(R.drawable.swain);
                        break;
                    case 66:
                        i.setImageResource(R.drawable.skarner);
                        break;
                    case 67:
                        i.setImageResource(R.drawable.sivir);
                        break;
                    case 68:
                        i.setImageResource(R.drawable.xinzhao);
                        break;
                    case 69:
                        i.setImageResource(R.drawable.syndra);
                        break;
                    case 70:
                        i.setImageResource(R.drawable.singed);
                        break;
                    case 71:
                        i.setImageResource(R.drawable.thresh);
                        break;
                    case 72:
                        i.setImageResource(R.drawable.ahri);
                        break;
                    case 73:
                        i.setImageResource(R.drawable.amumu);
                        break;
                    case 74:
                        i.setImageResource(R.drawable.aurelionsol);
                        break;
                    case 75:
                        i.setImageResource(R.drawable.ivern);
                        break;
                    case 76:
                        i.setImageResource(R.drawable.azir);
                        break;
                    case 77:
                        i.setImageResource(R.drawable.akali);
                        break;
                    case 78:
                        i.setImageResource(R.drawable.atrox);
                        break;
                    case 79:
                        i.setImageResource(R.drawable.aphelios);
                        break;
                    case 80:
                        i.setImageResource(R.drawable.alistar);
                        break;
                    case 81:
                        i.setImageResource(R.drawable.annie);
                        break;
                    case 82:
                        i.setImageResource(R.drawable.anivia);
                        break;
                    case 83:
                        i.setImageResource(R.drawable.ashe);
                        break;
                    case 84:
                        i.setImageResource(R.drawable.yasuo);
                        break;
                    case 85:
                        i.setImageResource(R.drawable.ekko);
                        break;
                    case 86:
                        i.setImageResource(R.drawable.elise);
                        break;
                    case 87:
                        i.setImageResource(R.drawable.monkeyking);
                        break;
                    case 88:
                        i.setImageResource(R.drawable.ornn);
                        break;
                    case 89:
                        i.setImageResource(R.drawable.orianna);
                        break;
                    case 90:
                        i.setImageResource(R.drawable.olaf);
                        break;
                    case 91:
                        i.setImageResource(R.drawable.yone);
                        break;
                    case 92:
                        i.setImageResource(R.drawable.yorick);
                        break;
                    case 93:
                        i.setImageResource(R.drawable.udyr);
                        break;
                    case 94:
                        i.setImageResource(R.drawable.urgot);
                        break;
                    case 95:
                        i.setImageResource(R.drawable.warwick);
                        break;
                    case 96:
                        i.setImageResource(R.drawable.yuumi);
                        break;
                    case 97:
                        i.setImageResource(R.drawable.lillia);
                        break;
                    case 98:
                        i.setImageResource(R.drawable.ivern);
                        break;
                    case 99:
                        i.setImageResource(R.drawable.ezreal);
                        break;
                    case 100:
                        i.setImageResource(R.drawable.illaoi);
                        break;
                    case 101:
                        i.setImageResource(R.drawable.jarvan4);
                        break;
                    case 102:
                        i.setImageResource(R.drawable.xayah);
                        break;
                    case 103:
                        i.setImageResource(R.drawable.zyra);
                        break;
                    case 104:
                        i.setImageResource(R.drawable.zac);
                        break;
                    case 105:
                        i.setImageResource(R.drawable.janna);
                        break;
                    case 106:
                        i.setImageResource(R.drawable.jax);
                        break;
                    case 107:
                        i.setImageResource(R.drawable.zed);
                        break;
                    case 108:
                        i.setImageResource(R.drawable.xerath);
                        break;
                    case 109:
                        i.setImageResource(R.drawable.jayce);
                        break;
                    case 110:
                        i.setImageResource(R.drawable.zoe);
                        break;
                    case 111:
                        i.setImageResource(R.drawable.ziggs);
                        break;
                    case 112:
                        i.setImageResource(R.drawable.jhin);
                        break;
                    case 113:
                        i.setImageResource(R.drawable.zilean);
                        break;
                    case 114:
                        i.setImageResource(R.drawable.jinx);
                        break;
                    case 115:
                        i.setImageResource(R.drawable.chogath);
                        break;
                    case 116:
                        i.setImageResource(R.drawable.karma);
                        break;
                    case 117:
                        i.setImageResource(R.drawable.camille);
                        break;
                    case 118:
                        i.setImageResource(R.drawable.kassadin);
                        break;
                    case 119:
                        i.setImageResource(R.drawable.karthus);
                        break;
                    case 120:
                        i.setImageResource(R.drawable.cassiopeia);
                        break;
                    case 121:
                        i.setImageResource(R.drawable.kaisa);
                        break;
                    case 122:
                        i.setImageResource(R.drawable.khazix);
                        break;
                    case 123:
                        i.setImageResource(R.drawable.katarina);
                        break;
                    case 124:
                        i.setImageResource(R.drawable.kalista);
                        break;
                    case 125:
                        i.setImageResource(R.drawable.kennen);
                        break;
                    case 126:
                        i.setImageResource(R.drawable.caitlyn);
                        break;
                    case 127:
                        i.setImageResource(R.drawable.kayn);
                        break;
                    case 128:
                        i.setImageResource(R.drawable.kayle);
                        break;
                    case 129:
                        i.setImageResource(R.drawable.kogmaw);
                        break;
                    case 130:
                        i.setImageResource(R.drawable.corki);
                        break;
                    case 131:
                        i.setImageResource(R.drawable.quinn);
                        break;
                    case 132:
                        i.setImageResource(R.drawable.kled);
                        break;
                    case 133:
                        i.setImageResource(R.drawable.qiyana);
                        break;
                    case 134:
                        i.setImageResource(R.drawable.kindred);
                        break;
                    case 135:
                        i.setImageResource(R.drawable.taric);
                        break;
                    case 136:
                        i.setImageResource(R.drawable.talon);
                        break;
                    case 137:
                        i.setImageResource(R.drawable.taliyah);
                        break;
                    case 138:
                        i.setImageResource(R.drawable.tahmkench);
                        break;
                    case 139:
                        i.setImageResource(R.drawable.trundle);
                        break;
                    case 140:
                        i.setImageResource(R.drawable.tristana);
                        break;
                    case 141:
                        i.setImageResource(R.drawable.tryndamere);
                        break;
                    case 142:
                        i.setImageResource(R.drawable.twistedfate);
                        break;
                    case 143:
                        i.setImageResource(R.drawable.twitch);
                        break;
                    case 144:
                        i.setImageResource(R.drawable.teemo);
                        break;
                    case 145:
                        i.setImageResource(R.drawable.pyke);
                        break;
                    case 146:
                        i.setImageResource(R.drawable.pantheon);
                        break;
                    case 147:
                        i.setImageResource(R.drawable.fiddlesticks);
                        break;
                    case 148:
                        i.setImageResource(R.drawable.fiora);
                        break;
                    case 149:
                        i.setImageResource(R.drawable.fizz);
                        break;
                    case 150:
                        i.setImageResource(R.drawable.heimerdinger);
                        break;
                    case 151:
                        i.setImageResource(R.drawable.hecarim);
                        break;
                    default:
                        break;
                }
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickTopSpell1(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        top_spell1 = 1;
                        top_spell1_time = 180;
                        top_spell1_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        top_spell1 = 2;
                        top_spell1_time = 420;
                        top_spell1_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        top_spell1 = 3;
                        top_spell1_time = 240;
                        top_spell1_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        top_spell1 = 4;
                        top_spell1_time = 210;
                        top_spell1_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        top_spell1 = 5;
                        top_spell1_time = 210;
                        top_spell1_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        top_spell1 = 6;
                        top_spell1_time = 210;
                        top_spell1_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        top_spell1 = 7;
                        top_spell1_time = 180;
                        top_spell1_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        top_spell1 = 8;
                        top_spell1_time = 90;
                        top_spell1_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        top_spell1 = 9;
                        top_spell1_time = 300;
                        top_spell1_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }
                String str = "";
                t.setText(str+top_spell1_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickTopSpell2(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        top_spell2 = 1;
                        top_spell2_time = 180;
                        top_spell2_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        top_spell2 = 2;
                        top_spell2_time = 420;
                        top_spell2_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        top_spell2 = 3;
                        top_spell2_time = 240;
                        top_spell2_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        top_spell2 = 4;
                        top_spell2_time = 210;
                        top_spell2_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        top_spell2 = 5;
                        top_spell2_time = 210;
                        top_spell2_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        top_spell2 = 6;
                        top_spell2_time = 210;
                        top_spell2_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        top_spell2 = 7;
                        top_spell2_time = 180;
                        top_spell2_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        top_spell2 = 8;
                        top_spell2_time = 90;
                        top_spell2_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        top_spell2 = 9;
                        top_spell2_time = 300;
                        top_spell2_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }

                String str = "";
                t.setText(str+top_spell2_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickJungleSpell1(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        jungle_spell1 = 1;
                        jungle_spell1_time = 180;
                        jungle_spell1_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        jungle_spell1 = 2;
                        jungle_spell1_time = 420;
                        jungle_spell1_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        jungle_spell1 = 3;
                        jungle_spell1_time = 240;
                        jungle_spell1_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        jungle_spell1 = 4;
                        jungle_spell1_time = 210;
                        jungle_spell1_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        jungle_spell1 = 5;
                        jungle_spell1_time = 210;
                        jungle_spell1_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        jungle_spell1 = 6;
                        jungle_spell1_time = 210;
                        jungle_spell1_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        jungle_spell1 = 7;
                        jungle_spell1_time = 180;
                        jungle_spell1_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        jungle_spell1 = 8;
                        jungle_spell1_time = 90;
                        jungle_spell1_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        jungle_spell1 = 9;
                        jungle_spell1_time = 300;
                        jungle_spell1_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }

                String str = "";
                t.setText(str+jungle_spell1_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickJungleSpell2(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        jungle_spell2 = 1;
                        jungle_spell2_time = 180;
                        jungle_spell2_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        jungle_spell2 = 2;
                        jungle_spell2_time = 420;
                        jungle_spell2_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        jungle_spell2 = 3;
                        jungle_spell2_time = 240;
                        jungle_spell2_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        jungle_spell2 = 4;
                        jungle_spell2_time = 210;
                        jungle_spell2_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        jungle_spell2 = 5;
                        jungle_spell2_time = 210;
                        jungle_spell2_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        jungle_spell2 = 6;
                        jungle_spell2_time = 210;
                        jungle_spell2_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        jungle_spell2 = 7;
                        jungle_spell2_time = 180;
                        jungle_spell2_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        jungle_spell2 = 8;
                        jungle_spell2_time = 90;
                        jungle_spell2_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        jungle_spell2 = 9;
                        jungle_spell2_time = 300;
                        jungle_spell2_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }

                String str = "";
                t.setText(str+jungle_spell2_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickMidSpell1(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        mid_spell1 = 1;
                        mid_spell1_time = 180;
                        mid_spell1_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        mid_spell1 = 2;
                        mid_spell1_time = 420;
                        mid_spell1_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        mid_spell1 = 3;
                        mid_spell1_time = 240;
                        mid_spell1_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        mid_spell1 = 4;
                        mid_spell1_time = 210;
                        mid_spell1_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        mid_spell1 = 5;
                        mid_spell1_time = 210;
                        mid_spell1_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        mid_spell1 = 6;
                        mid_spell1_time = 210;
                        mid_spell1_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        mid_spell1 = 7;
                        mid_spell1_time = 180;
                        mid_spell1_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        mid_spell1 = 8;
                        mid_spell1_time = 90;
                        mid_spell1_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        mid_spell1 = 9;
                        mid_spell1_time = 300;
                        mid_spell1_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }

                String str = "";
                t.setText(str+mid_spell1_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickMidSpell2(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        mid_spell2 = 1;
                        mid_spell2_time = 180;
                        mid_spell2_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        mid_spell2 = 2;
                        mid_spell2_time = 420;
                        mid_spell2_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        mid_spell2 = 3;
                        mid_spell2_time = 240;
                        mid_spell2_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        mid_spell2 = 4;
                        mid_spell2_time = 210;
                        mid_spell2_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        mid_spell2 = 5;
                        mid_spell2_time = 210;
                        mid_spell2_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        mid_spell2 = 6;
                        mid_spell2_time = 210;
                        mid_spell2_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        mid_spell2 = 7;
                        mid_spell2_time = 180;
                        mid_spell2_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        mid_spell2 = 8;
                        mid_spell2_time = 90;
                        mid_spell2_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        mid_spell2 = 9;
                        mid_spell2_time = 300;
                        mid_spell2_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }
                String str = "";
                t.setText(str+mid_spell2_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickAdSpell1(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        ad_spell1 = 1;
                        ad_spell1_time = 180;
                        ad_spell1_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        ad_spell1 = 2;
                        ad_spell1_time = 420;
                        ad_spell1_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        ad_spell1 = 3;
                        ad_spell1_time = 240;
                        ad_spell1_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        ad_spell1 = 4;
                        ad_spell1_time = 210;
                        ad_spell1_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        ad_spell1 = 5;
                        ad_spell1_time = 210;
                        ad_spell1_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        ad_spell1 = 6;
                        ad_spell1_time = 210;
                        ad_spell1_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        ad_spell1 = 7;
                        ad_spell1_time = 180;
                        ad_spell1_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        ad_spell1 = 8;
                        ad_spell1_time = 90;
                        ad_spell1_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        ad_spell1 = 9;
                        ad_spell1_time = 300;
                        ad_spell1_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }
                String str = "";
                t.setText(str+ad_spell1_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickAdSpell2(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        ad_spell2 = 1;
                        ad_spell2_time = 180;
                        ad_spell2_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        ad_spell2 = 2;
                        ad_spell2_time = 420;
                        ad_spell2_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        ad_spell2 = 3;
                        ad_spell2_time = 240;
                        ad_spell2_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        ad_spell2 = 4;
                        ad_spell2_time = 210;
                        ad_spell2_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        ad_spell2 = 5;
                        ad_spell2_time = 210;
                        ad_spell2_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        ad_spell2 = 6;
                        ad_spell2_time = 210;
                        ad_spell2_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        ad_spell2 = 7;
                        ad_spell2_time = 180;
                        ad_spell2_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        ad_spell2 = 8;
                        ad_spell2_time = 90;
                        ad_spell2_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        ad_spell2 = 9;
                        ad_spell2_time = 300;
                        ad_spell2_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }
                String str = "";
                t.setText(str+ad_spell2_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickSupSpell1(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        sup_spell1 = 1;
                        sup_spell1_time = 180;
                        sup_spell1_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        sup_spell1 = 2;
                        sup_spell1_time = 420;
                        sup_spell1_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        sup_spell1 = 3;
                        sup_spell1_time = 240;
                        sup_spell1_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        sup_spell1 = 4;
                        sup_spell1_time = 210;
                        sup_spell1_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        sup_spell1 = 5;
                        sup_spell1_time = 210;
                        sup_spell1_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        sup_spell1 = 6;
                        sup_spell1_time = 210;
                        sup_spell1_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        sup_spell1 = 7;
                        sup_spell1_time = 180;
                        sup_spell1_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        sup_spell1 = 8;
                        sup_spell1_time = 90;
                        sup_spell1_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        sup_spell1 = 9;
                        sup_spell1_time = 300;
                        sup_spell1_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }
                String str = "";
                t.setText(str+sup_spell1_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnClickSupSpell2(View v, final ImageButton i, final TextView t){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final String[] spells = getResources().getStringArray(R.array.Spell);
        final ArrayList<String> selected =  new ArrayList<String>();
        selected.add(spells[0]);
        final int[] spell = {0};
        builder.setTitle("스펠 선택");
        builder.setSingleChoiceItems(R.array.Spell, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selected.clear();
                selected.add(spells[which]);
                spell[0] = which;
            }
        });
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (spell[0]){
                    case 0:
                        sup_spell2 = 1;
                        sup_spell2_time = 180;
                        sup_spell2_time_save = 180;
                        i.setImageResource(R.drawable.fire);
                        break;
                    case 1:
                        sup_spell2 = 2;
                        sup_spell2_time = 420;
                        sup_spell2_time_save = 420;
                        i.setImageResource(R.drawable.teleport);
                        break;
                    case 2:
                        sup_spell2 = 3;
                        sup_spell2_time = 240;
                        sup_spell2_time_save = 240;
                        i.setImageResource(R.drawable.heal);
                        break;
                    case 3:
                        sup_spell2 = 4;
                        sup_spell2_time = 210;
                        sup_spell2_time_save = 210;
                        i.setImageResource(R.drawable.cleans);
                        break;
                    case 4:
                        sup_spell2 = 5;
                        sup_spell2_time = 210;
                        sup_spell2_time_save = 210;
                        i.setImageResource(R.drawable.talzin);
                        break;
                    case 5:
                        sup_spell2 = 6;
                        sup_spell2_time = 210;
                        sup_spell2_time_save = 210;
                        i.setImageResource(R.drawable.haste);
                        break;
                    case 6:
                        sup_spell2 = 7;
                        sup_spell2_time = 180;
                        sup_spell2_time_save = 180;
                        i.setImageResource(R.drawable.barrier);
                        break;
                    case 7:
                        sup_spell2 = 8;
                        sup_spell2_time = 90;
                        sup_spell2_time_save = 90;
                        i.setImageResource(R.drawable.smite);
                        break;
                    case 8:
                        sup_spell2 = 9;
                        sup_spell2_time = 300;
                        sup_spell2_time_save = 300;
                        i.setImageResource(R.drawable.flash);
                        break;
                    default:
                        break;
                }
                String str = "";
                t.setText(str+sup_spell2_time);
            }
        });
        builder.setNegativeButton("취소", null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void OnclickTopLevelUp(View v, TextView lvl_txt){
        if(top_lvl<18){
            top_lvl = top_lvl+1;
            String str = "";
            lvl_txt.setText(str+top_lvl);
        }
    }

    public void OnclickTopLevelDown(View v, TextView lvl_txt){
        if(top_lvl>1){
            top_lvl = top_lvl-1;
            String str = "";
            lvl_txt.setText(str+top_lvl);
        }
    }

    public void OnclickJungleLevelUp(View v, TextView lvl_txt){
        if(jungle_lvl<18){
            jungle_lvl = jungle_lvl+1;
            String str = "";
            lvl_txt.setText(str+jungle_lvl);
        }
    }

    public void OnclickJungleLevelDown(View v, TextView lvl_txt){
        if(jungle_lvl>1){
            jungle_lvl = jungle_lvl-1;
            String str = "";
            lvl_txt.setText(str+jungle_lvl);
        }
    }

    public void OnclickMidLevelUp(View v, TextView lvl_txt){
        if(mid_lvl<18){
            mid_lvl = mid_lvl+1;
            String str = "";
            lvl_txt.setText(str+mid_lvl);
        }
    }

    public void OnclickMidLevelDown(View v, TextView lvl_txt){
        if(mid_lvl>1){
            mid_lvl = mid_lvl-1;
            String str = "";
            lvl_txt.setText(str+mid_lvl);
        }
    }

    public void OnclickAdLevelUp(View v, TextView lvl_txt){
        if(ad_lvl<18){
            ad_lvl = ad_lvl+1;
            String str = "";
            lvl_txt.setText(str+ad_lvl);
        }
    }

    public void OnclickAdLevelDown(View v, TextView lvl_txt){
        if(ad_lvl>1){
            ad_lvl = ad_lvl-1;
            String str = "";
            lvl_txt.setText(str+ad_lvl);
        }
    }

    public void OnclickSupLevelUp(View v, TextView lvl_txt){
        if(sup_lvl<18){
            sup_lvl = sup_lvl+1;
            String str = "";
            lvl_txt.setText(str+sup_lvl);
        }
    }

    public void OnclickSupLevelDown(View v, TextView lvl_txt){
        if(sup_lvl>1){
            sup_lvl = sup_lvl-1;
            String str = "";
            lvl_txt.setText(str+sup_lvl);
        }
    }

    public void OnClickTopFoot(View v, Button foot_B){
        if(!top_foot){
            top_foot = true;
            foot_B.setText("ON");
        }else{
            top_foot = false;
            foot_B.setText("OFF");
        }
    }

    public void OnClickJungleFoot(View v, Button foot_B){
        if(!jungle_foot){
            jungle_foot = true;
            foot_B.setText("ON");
        }else{
            jungle_foot = false;
            foot_B.setText("OFF");
        }
    }

    public void OnClickMidFoot(View v, Button foot_B){
        if(!mid_foot){
            mid_foot = true;
            foot_B.setText("ON");
        }else{
            mid_foot = false;
            foot_B.setText("OFF");
        }
    }

    public void OnClickAdFoot(View v, Button foot_B){
        if(!ad_foot){
            ad_foot = true;
            foot_B.setText("ON");
        }else{
            ad_foot = false;
            foot_B.setText("OFF");
        }
    }

    public void OnClickSupFoot(View v, Button foot_B){
        if(!sup_foot){
            sup_foot = true;
            foot_B.setText("ON");
        }else{
            sup_foot = false;
            foot_B.setText("OFF");
        }
    }

}