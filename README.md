# Car Parking Management System

## Overview

With the increasing number of private vehicles in cities like Mumbai, finding parking has become a significant challenge. This Car Parking Management System aims to alleviate congestion in parking areas by allowing users to reserve parking spots in advance, thereby saving time and reducing traffic.

## Features

- **User Registration & Login**: Secure registration and login for users.
- **Slot Reservation**: Users can select parking slots based on their convenience and make advance payments.
- **Booking Management**: View all bookings in a user-friendly interface.

## Technology Stack

- **Programming Language**: Java
  - Utilizes features like Strings and 2D Arrays.
- **Frontend**: 
  - Java Swing and AWT for creating a graphical user interface (GUI).
  - Components include `JFrame`, `JPanels`, `JTextFields`, `JButtons`, and `JTables`.
- **Backend**:
  - MySQL (local variables for data management in the current version).

## Modules

1. **Registration Module**: User registration with validation for fields like Name, Email ID, Phone Number, and Password.
2. **Login Module**: Users log in with their credentials; validation checks in place.
3. **About Us Module**: Information about the application and usage instructions.
4. **Booking Module**: Users can choose a date and time slot for parking.
5. **View Bookings Module**: Users can view their booking details.
6. **Rates Module**: Displays parking rates based on vehicle type.

## Project Implementation

The application is developed using Java Swing, featuring a main `JFrame` and multiple `JPanels`. Validations are implemented using Regex, and a 2D array is used to manage slot availability to prevent overlapping bookings.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Himali09/CarParkingManagementSystem.git
