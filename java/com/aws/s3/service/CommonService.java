package com.aws.s3.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.aws.s3.constants.CommonConstants;

public class CommonService {

	public void getObj(AmazonS3 s3client) {
		String bucketName = CommonConstants.BUCKET_NAME;

		try {
			ObjectListing listObjects = s3client.listObjects(new ListObjectsRequest().withBucketName(bucketName));
			if (listObjects.getObjectSummaries().size() > 0) {
				System.out.println("file name: " + listObjects.getObjectSummaries());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
