package ofPosition;

public class UserFactoryFixed {
	public User CreateUser(
			string firstName,
			string lastName,
			string phoneNumber)
			{
			return new User
			{
			FirstName = firstName,
			LastName = lastName,
			PhoneNumber = phoneNumber
			};
			}
			}
}
