package com.ramon.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Double num1, num2, res;
    int count = 0;
    ArrayList<Double> nums;
    int seleccion;
    ArrayList<Integer> operaciones;

    TextView tvEntrada;
    TextView tvSalida;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnSum;
    Button btnRes;
    Button btnMul;
    Button btnDiv;
    Button btnIgual;
    Button btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nums = new ArrayList<>();
        operaciones = new ArrayList<>();

        // Iniciamos todos los elementos

        tvEntrada = (TextView) findViewById(R.id.tvEntrada);
        tvSalida = (TextView) findViewById(R.id.tvSalida);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnRes = (Button) findViewById(R.id.btnRes);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);

        // Asignamos los eventos onClick

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"0");
                parseNumber();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"1");
                parseNumber();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"2");
                parseNumber();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"3");
                parseNumber();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"4");
                parseNumber();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"5");
                parseNumber();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"6");
                parseNumber();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"7");
                parseNumber();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"8");
                parseNumber();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+"9");
                parseNumber();
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+" + ");
                res = parseNumber();
                seleccion = 1;
                count += 2;
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+" - ");
                res = parseNumber();
                seleccion = 2;
                count += 2;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+" * ");
                res = parseNumber();
                seleccion = 3;
                count += 2;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText(tvEntrada.getText()+" / ");
                res = parseNumber();
                seleccion = 4;
                count += 2;
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parseText();

                Log.d("Boton igual", "Num1 " + num1 + ", Num2 " + num2 + ", Seleccion " + seleccion);

                if (seleccion == 1) {
                    res = num1 + num2;

                    tvSalida.setText(res.toString());
                } else if (seleccion == 2) {
                    res = num1 - num2;

                    tvSalida.setText(res.toString());
                } else if (seleccion == 3) {
                    res = num1 * num2;

                    tvSalida.setText(res.toString());
                } else if (seleccion == 4) {
                    res = num1 / num2;

                    tvSalida.setText(res.toString());
                }
/*
                for (int i = 1; i < nums.size(); i++) {
                    if (operaciones.get(i - 1) == 1) {
                        res += nums.get(i);
                    } else if (operaciones.get(i - 1) == 2) {
                        res -= nums.get(i);
                    } else if (operaciones.get(i - 1) == 3) {
                        res *= nums.get(i);
                    } else if (operaciones.get(i - 1) == 4) {
                        res /= nums.get(i);
                    }
                }

                Log.d("Boton igual", "Num1 " + num1 + ", Num2 " + num2 + ", Seleccion " + seleccion);

                tvSalida.setText(res.toString());
*/
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEntrada.setText("");
                tvSalida.setText("");
                res = 0.0;
                count = 0;
                seleccion = 0;
            }
        });
    }

    public void parseText () {
        String[] resultado = tvEntrada.getText().toString().split(" ");


        Double num = Double.parseDouble(resultado[count]);
        Double aux = 0.0;

        if (seleccion == 1) {
            aux = res + num;
            tvSalida.setText(aux.toString());
        } else if (seleccion == 2) {
            aux = res - num;
            tvSalida.setText(aux.toString());
        } else if (seleccion == 3) {
            aux = res * num;
            tvSalida.setText(aux.toString());
        } else if (seleccion == 4) {
            aux = res / num;
            tvSalida.setText(aux.toString());
        }
/*
        if (resultado.length == 1) {
            num1 = Double.parseDouble(resultado[0]);
            res = num1;
        }

        if (resultado.length == 2) {
            if (resultado[1].equals("+"))
                seleccion = 1;
            else if (resultado[1].equals("-"))
                seleccion = 2;
            else if (resultado[1].equals("*"))
                seleccion = 3;
            else if (resultado[1].equals("/"))
                seleccion = 4;
        }

        if (resultado.length == 3) {
            num2 = Double.parseDouble(resultado[2]);

            if (seleccion == 1) {
                res += num2;

                tvSalida.setText(res.toString());
            } else if (seleccion == 2) {
                res -= num2;

                tvSalida.setText(res.toString());
            } else if (seleccion == 3) {
                res *= num2;

                tvSalida.setText(res.toString());
            } else if (seleccion == 4) {
                res /= num2;

                tvSalida.setText(res.toString());
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            if (resultado.length == 1) {
                res = Double.parseDouble(resultado[0]);
            } else if ((i % 2) == 0) {
                if (seleccion == 1) {
                    res += Double.parseDouble(resultado[i]);
                } else if (seleccion == 2) {
                    res -= Double.parseDouble(resultado[i]);
                } else if (seleccion == 3) {
                    res *= Double.parseDouble(resultado[i]);
                } else if (seleccion == 4) {
                    res /= Double.parseDouble(resultado[i]);
                }
            } else {
                if (resultado[i].equals("+"))
                    seleccion = 1;
                else if (resultado[i].equals("-"))
                    seleccion = 2;
                else if (resultado[i].equals("*"))
                    seleccion = 3;
                else if (resultado[i].equals("/"))
                    seleccion = 4;
            }
        }
*/
    }

    public Double parseNumber () {
        String[] resultado = tvEntrada.getText().toString().split(" ");

        Double num = Double.parseDouble(resultado[count]);
        Double aux = 0.0;

        if (count != 0) {
            if (seleccion == 1) {
                aux = res + num;
            } else if (seleccion == 2) {
                aux = res - num;
            } else if (seleccion == 3) {
                aux = res * num;
            } else if (seleccion == 4) {
                aux = res / num;
            }
        } else {
            aux = num;
        }

        if (aux.toString().endsWith(".0")) {
            tvSalida.setText(aux.toString().substring(0, aux.toString().length() - 2));
        } else {
            tvSalida.setText(aux.toString());
        }

        Log.d("Funcion parseNumber", "count = " + count + " aux = " + aux + " num = " + num + " res = " + res);

        return num;
    }
}
