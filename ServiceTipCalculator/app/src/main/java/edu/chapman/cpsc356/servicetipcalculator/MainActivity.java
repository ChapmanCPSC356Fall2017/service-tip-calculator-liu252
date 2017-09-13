package edu.chapman.cpsc356.servicetipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button decimal;

    private Button add;
    private Button clear;

    private Button back;

    private Button tip;
    private Button total;

    private TextView numberText;
    private TextView instruction;

    private Boolean usedDecimal = false;
    private Boolean tipMode = false;
    private String rating = "0";
    private int ratingCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.one = (Button) findViewById(R.id.one);
        this.two = (Button) findViewById(R.id.two);
        this.three = (Button) findViewById(R.id.three);
        this.four = (Button) findViewById(R.id.four);
        this.five = (Button) findViewById(R.id.five);
        this.six = (Button) findViewById(R.id.six);
        this.seven = (Button) findViewById(R.id.seven);
        this.eight = (Button) findViewById(R.id.eight);
        this.nine = (Button) findViewById(R.id.nine);
        this.zero = (Button) findViewById(R.id.zero);
        this.decimal = (Button) findViewById(R.id.decimal);

        this.add = (Button) findViewById(R.id.plus);
        this.clear = (Button) findViewById(R.id.clear);

        this.back = (Button) findViewById(R.id.backspace);

        this.tip = (Button) findViewById(R.id.Tip);
        this.total = (Button) findViewById(R.id.Total);

        this.numberText = (TextView) findViewById(R.id.NumberText);
        this.instruction = (TextView) findViewById(R.id.Instruction);


        //Number Buttons
        this.one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "1";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "1";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "1";
                }
                numberText.setText(update);
            }
        });

        this.two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "2";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "2";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "2";
                }
                numberText.setText(update);
            }
        });

        this.three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "3";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "3";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "3";
                }
                numberText.setText(update);
            }
        });

        this.four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "4";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "4";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "4";
                }
                numberText.setText(update);
            }
        });

        this.five.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "5";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "5";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "5";
                }
                numberText.setText(update);
            }
        });

        this.six.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "6";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "6";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "6";
                }
                numberText.setText(update);
            }
        });

        this.seven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "7";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "7";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "7";
                }
                numberText.setText(update);
            }
        });

        this.eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "8";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "8";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "8";
                }
                numberText.setText(update);
            }
        });

        this.nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "9";
                }
                else if(tipMode)
                {
                    if (ratingCount == 0)
                    {
                        rating = "9";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "9";
                }
                numberText.setText(update);
            }
        });

        this.zero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(current.equals("0") && !tipMode)
                {
                    update = "0";
                }
                else if(tipMode)
                {
                    if (ratingCount == 1 && rating.equals("1"))
                    {
                        rating = "0";
                        ratingCount++;
                        String ratingText = "Enter Service Rating \n" + rating;
                        instruction.setText(ratingText);
                    }
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current + "0";
                }
                numberText.setText(update);
            }
        });

        this.decimal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String current = numberText.getText().toString();
                String update = "";
                if(!usedDecimal && !tipMode)
                {
                    update = current + ".";
                    usedDecimal = true;
                    numberText.setText(update);
                }
                else if(tipMode)
                {
                    update = current;
                    numberText.setText(update);
                }
                else if (!tipMode)
                {
                    numberText.setText(current);
                }
            }
        });

        this.add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String current = numberText.getText().toString();
                String update = "";
                if(current.substring(current.length()- 1).equals("+")|| current.substring(current.length()- 1).equals("-") || current.equals("0") && !tipMode)
                {
                    numberText.setText(current);
                }
                else if(tipMode)
                {
                    update = current;
                    numberText.setText(update);
                }
                else if (!tipMode)
                {
                    update = current + "+";
                    usedDecimal = false;
                    numberText.setText(update);
                }
            }
        });

        this.clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(tipMode)
                {
                    instruction.setText("Enter Prices");
                    numberText.setText("0");
                    tipMode = false;
                    usedDecimal = false;
                    rating = "0";
                    ratingCount = 0;
                }
                else if (!tipMode)
                {
                    instruction.setText("Enter Prices");
                    numberText.setText("0");
                    usedDecimal = false;
                }
            }
        });

        this.back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String current = numberText.getText().toString();
                String update = "";
                if(current.substring(current.length()-1).equals(".") && !tipMode)
                {
                    usedDecimal = false;
                    update = current.substring(0,(current.length()-1));
                }
                else if (current.substring(current.length()-1).equals("+") || current.substring(current.length()-1).equals("-")&& !tipMode)
                {
                    for(int x = 0; x < current.length()-1; ++x)
                    {
                        if (current.charAt(x) == '.')
                        {
                            usedDecimal = true;
                            break;
                        }
                        else
                        {
                            usedDecimal = false;
                        }
                    }
                    update = current.substring(0,(current.length()-1));
                }
                else if (current.equals("0")&& !tipMode)
                {
                    update = current;
                }
                else if (current.length() == 1&& !tipMode)
                {
                    update = "0";
                }
                else if (tipMode)
                {
                    if(ratingCount == 2)
                    {
                        rating = current.substring(0, (current.length() - 1));
                        ratingCount--;
                    }
                    else if (ratingCount == 1)
                    {
                        rating = "0";
                        ratingCount--;
                    }
                    String ratingText = "Enter Service Rating \n" + rating;
                    instruction.setText(ratingText);
                    update = current;
                }
                else if (!tipMode)
                {
                    update = current.substring(0,(current.length()-1));
                }

                numberText.setText(update);

            }
        });

        this.tip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num = 0;
                int sym = 0;
                int symCount = 0;
                int start = 0;
                double numbers[] = new double[50];
                char symbols[] = new char[50];
                double calculate = 0.0;
                if(!tipMode)
                {
                    rating = "0";
                    ratingCount = 0;
                    String stringForm = numberText.getText().toString();
                    if(!stringForm.substring((stringForm.length()-1)).equals("+"))
                    {
                        for (int x = 0; x < stringForm.length(); x++) {
                            if (stringForm.charAt(x) == '+' || stringForm.charAt(x) == '-') {
                                numbers[num] = Double.parseDouble(stringForm.substring(start, x));
                                start = x + 1;
                                num++;
                                if (stringForm.charAt(x) == '+') {
                                    symbols[sym] = '+';
                                    sym++;
                                } else if (stringForm.charAt(x) == '-') {
                                    symbols[sym] = '-';
                                    sym++;
                                }
                            }
                            if (x == stringForm.length() - 1) {
                                numbers[num] = Double.parseDouble(stringForm.substring(start));
                                num++;
                            }
                        }
                        for (int x = 0; x < (num + 1); x++) {

                            if (sym == 0) {
                                calculate = Double.parseDouble(stringForm);
                            } else if (x == 0) {
                                calculate = numbers[x];
                            } else if (x > 0) {
                                if (symbols[symCount] == '+') {
                                    calculate = calculate + numbers[x];
                                    symCount++;
                                } else if (symbols[symCount] == '-') {
                                    calculate = calculate - numbers[x];
                                    symCount++;
                                }
                            }
                        }
                        usedDecimal = false;
                        stringForm = Double.toString(calculate);
                        numberText.setText(stringForm);
                        symCount = 0;
                        num = 0;
                        sym = 0;
                        String tipMessage = "Enter Service Rating \nFrom 1 - 10";
                        instruction.setText(tipMessage);
                        tipMode = true;
                    }


                }


            }
        });

        this.total.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num = 0;
                int sym = 0;
                int symCount = 0;
                int start = 0;
                double numbers[] = new double[50];
                char symbols[] = new char[50];
                double calculate = 0.0;
                if(!tipMode)
                {
                    String stringForm = numberText.getText().toString();
                    if(!stringForm.substring((stringForm.length()-1)).equals("+")) {
                        for (int x = 0; x < stringForm.length(); x++) {
                            if (stringForm.charAt(x) == '+' || stringForm.charAt(x) == '-') {
                                numbers[num] = Double.parseDouble(stringForm.substring(start, x));
                                start = x + 1;
                                num++;
                                if (stringForm.charAt(x) == '+') {
                                    symbols[sym] = '+';
                                    sym++;
                                } else if (stringForm.charAt(x) == '-') {
                                    symbols[sym] = '-';
                                    sym++;
                                }
                            }
                            if (x == stringForm.length() - 1) {
                                numbers[num] = Double.parseDouble(stringForm.substring(start));
                                num++;
                            }
                        }
                        for (int x = 0; x < (num + 1); x++) {

                            if (sym == 0) {
                                calculate = Double.parseDouble(stringForm);
                            } else if (x == 0) {
                                calculate = numbers[x];
                            } else if (x > 0) {
                                if (symbols[symCount] == '+') {
                                    calculate = calculate + numbers[x];
                                    symCount++;
                                } else if (symbols[symCount] == '-') {
                                    calculate = calculate - numbers[x];
                                    symCount++;
                                }
                            }
                        }
                        stringForm = Double.toString(calculate);
                        numberText.setText(stringForm);
                        symCount = 0;
                        num = 0;
                        sym = 0;
                    }
                }
                else if (tipMode)
                {
                    double amountBeforeTip = Double.parseDouble(numberText.getText().toString());
                    double afterTip = 0;
                    int ratingTransfer = Integer.parseInt(rating);
                    if (ratingTransfer == 0)
                    {
                        afterTip = amountBeforeTip * 1;
                    }
                    else if (ratingTransfer >= 1 && ratingTransfer <= 3)
                    {
                        afterTip = amountBeforeTip * 1.10;
                    }
                    else if (ratingTransfer >= 4 && ratingTransfer <= 5)
                    {
                        afterTip = amountBeforeTip * 1.13;
                    }
                    else if (ratingTransfer >= 6 && ratingTransfer <=7)
                    {
                        afterTip = amountBeforeTip * 1.15;
                    }
                    else if (ratingTransfer >= 8 && ratingTransfer <= 9)
                    {
                        afterTip = amountBeforeTip * 1.20;
                    }
                    else if (ratingTransfer == 10)
                    {
                        afterTip = amountBeforeTip * 1.25;
                    }
                    numberText.setText(Double.toString(afterTip));
                    instruction.setText("Total");
                    tipMode = false;
                    rating = "0";

                }
            }
        });
    }
}
