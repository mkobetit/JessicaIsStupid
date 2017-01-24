package database;

public class Queries {
	
	
	public static String getUsers = "select user.user_id, " +
									"user.first_name, " +
									"user.middle_name, " +
									"user.last_name, " +
									"user.email_address, " +
									"user.phone_number, " +
									"user.gender, " +
									"user_job.salary, "	+
									"job.job_title," +
									"company.company_name " +
									"from qa.user " +
									"inner join qa.user_job " +
									"on user_job.user_id=user.user_id " +
									"inner join qa.job " +
									"on job.job_id=user_job.job_id " +
									"inner join qa.company " +
									"on company.company_id=job.company_id";


	public static String getUsersByGender = "select user.user_id, " +
			"user.first_name, " +
			"user.middle_name, " +
			"user.last_name, " +
			"user.email_address, " +
			"user.phone_number, " +
			"user.gender, " +
			"user_job.salary, "	+
			"job.job_title," +
			"company.company_name " +
			"from qa.user " +
			"inner join qa.user_job " +
			"on user_job.user_id=user.user_id " +
			"inner join qa.job " +
			"on job.job_id=user_job.job_id " +
			"inner join qa.company " +
			"on company.company_id=job.company_id "
			+ "where qa.user.gender = ? ";

	public static String getUsersByLastName = "select user.user_id, " +
			"user.first_name, " +
			"user.middle_name, " +
			"user.last_name, " +
			"user.email_address, " +
			"user.phone_number, " +
			"user.gender, " +
			"user_job.salary, "	+
			"job.job_title," +
			"company.company_name " +
			"from qa.user " +
			"inner join qa.user_job " +
			"on user_job.user_id=user.user_id " +
			"inner join qa.job " +
			"on job.job_id=user_job.job_id " +
			"inner join qa.company " +
			"on company.company_id=job.company_id "
			+ "where qa.user.last_name = ? ";
}
