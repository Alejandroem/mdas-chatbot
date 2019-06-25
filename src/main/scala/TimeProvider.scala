package chatbot

import java.time.{LocalDate, LocalTime}

trait TimeProvider {
  def currentTime(): LocalTime
  def currentDate(): LocalDate
}
