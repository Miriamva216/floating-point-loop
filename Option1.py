def main():
    total = 0.0
    count = 0
    max_val = None
    min_val = None

    while count < 5:
        try:
            value = float(input(f"Enter floating-point number {count + 1}: "))
        except ValueError:
            print("Invalid input. Please enter a valid floating-point number.")
            continue

        total += value

        if count == 0:
            max_val = min_val = value
        else:
            if value > max_val:
                max_val = value
            if value < min_val:
                min_val = value

        count += 1

    average = total / 5
    interest = total * 0.20

    print(f"\nTotal: {total}")
    print(f"Average: {average}")
    print(f"Maximum: {max_val}")
    print(f"Minimum: {min_val}")
    print(f"Interest on total at 20%: {interest}")

if __name__ == "__main__":
    main()
