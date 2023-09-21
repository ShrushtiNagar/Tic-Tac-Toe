package com.shrushti.tictactoeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.shrushti.tictactoeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var cellId = 0
    private var activePlayer = 1
    private val player1 = ArrayList<Int>()
    private val player2 = ArrayList<Int>()
    private var pl1WinCnt = 0
    private var pl2WinCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fabtnBack.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btn1.setOnClickListener {
            cellId = 1
            if (activePlayer == 1) {
                binding.btn1.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn1.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn1.isEnabled = false

            checkWinner()

        }

        binding.btn2.setOnClickListener {
            cellId = 2
            if (activePlayer == 1) {
                binding.btn2.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn2.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn2.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn2.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn2.isEnabled = false

            checkWinner()

        }

        binding.btn3.setOnClickListener {
            cellId = 3
            if (activePlayer == 1) {
                binding.btn3.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn3.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.light_green
                    )
                )
            } else {
                binding.btn3.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn3.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn3.isEnabled = false

            checkWinner()
        }

        binding.btn4.setOnClickListener {
            cellId = 4
            if (activePlayer == 1) {
                binding.btn4.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn4.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn4.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn4.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn4.isEnabled = false

            checkWinner()

        }

        binding.btn5.setOnClickListener {
            cellId = 5
            if (activePlayer == 1) {
                binding.btn5.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn5.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn5.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn5.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn5.isEnabled = false

            checkWinner()

        }

        binding.btn6.setOnClickListener {
            cellId = 6
            if (activePlayer == 1) {
                binding.btn6.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn6.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn6.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn6.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn6.isEnabled = false

            checkWinner()

        }

        binding.btn7.setOnClickListener {
            cellId = 7
            if (activePlayer == 1) {
                binding.btn7.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn7.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn7.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn7.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn7.isEnabled = false

            checkWinner()

        }

        binding.btn8.setOnClickListener {
            cellId = 8
            if (activePlayer == 1) {
                binding.btn8.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn8.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn8.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn8.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn8.isEnabled = false

            checkWinner()

        }

        binding.btn9.setOnClickListener {
            cellId = 9
            if (activePlayer == 1) {
                binding.btn9.text = "O"
                activePlayer = 2
                player1.add(cellId)
                binding.btn9.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            } else {
                binding.btn9.text = "X"
                activePlayer = 1
                player2.add(cellId)
                binding.btn9.setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            binding.btn9.isEnabled = false

            checkWinner()

        }

    }

    private fun checkWinner() {


        var winner = -1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        } else if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        } else if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }

        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        } else if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        } else if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        } else if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }

        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        } else if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        } else if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        } else if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }

        if (!binding.btn1.isEnabled && !binding.btn2.isEnabled
            && !binding.btn3.isEnabled && !binding.btn4.isEnabled && !binding.btn5.isEnabled
            && !binding.btn6.isEnabled && !binding.btn7.isEnabled && !binding.btn8.isEnabled
            && !binding.btn9.isEnabled
            && winner == -1
        ) {
            Toast.makeText(
                this,
                "It is a Tie !",
                Toast.LENGTH_SHORT
            ).show()

            Toast.makeText(
                this,
                "Score ::  Player 1: $pl1WinCnt  Player 2: $pl2WinCount",
                Toast.LENGTH_LONG
            ).show()
            startNewGame()
        } else if (winner != -1) {


            var btnSelected: Button?
            for (i in 1..9) {
                btnSelected = when (i) {
                    1 -> binding.btn1
                    2 -> binding.btn2
                    3 -> binding.btn3
                    4 -> binding.btn4
                    5 -> binding.btn5
                    6 -> binding.btn6
                    7 -> binding.btn7
                    8 -> binding.btn8
                    9 -> binding.btn9
                    else -> null
                }

                if (btnSelected!!.isEnabled) {
                    btnSelected.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.brown
                        )
                    )
                    btnSelected.isEnabled = false
                }
            }

            if (winner == 1) {
                Toast.makeText(this, "Player 1 won the game!!", Toast.LENGTH_SHORT).show()
                pl1WinCnt++

            } else if (winner == 2) {
                Toast.makeText(this, "Player 2 won the game!!", Toast.LENGTH_SHORT).show()
                pl2WinCount++
            }

            Toast.makeText(
                this,
                "Score :: Player 1: $pl1WinCnt   Player 2: $pl2WinCount",
                Toast.LENGTH_LONG
            ).show()
            startNewGame()
        }


    }

    private fun startNewGame() {

        binding.tvNewGame.visibility = View.VISIBLE
        binding.tvNewGame.text = "Start a New Game"

        binding.tvNewGame.setOnClickListener {
            var btnSelected: Button?
            for (i in 1..9) {
                btnSelected = when (i) {
                    1 -> binding.btn1
                    2 -> binding.btn2
                    3 -> binding.btn3
                    4 -> binding.btn4
                    5 -> binding.btn5
                    6 -> binding.btn6
                    7 -> binding.btn7
                    8 -> binding.btn8
                    9 -> binding.btn9

                    else -> null
                }
                btnSelected!!.isEnabled = true
                btnSelected!!.text = ""
                btnSelected!!.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.btn_state_disabled_color
                    )
                )
            }

            cellId = 0
            activePlayer = 1
            player1.clear()
            player2.clear()

            binding.tvNewGame.visibility = View.GONE

        }

    }
}