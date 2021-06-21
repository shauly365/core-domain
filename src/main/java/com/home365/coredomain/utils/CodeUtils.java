package com.home365.coredomain.utils;

import java.util.Objects;

public abstract class CodeUtils {
    public static Boolean checkIfObjectIsNotNullAndTrue(Boolean bo) {
        return Objects.nonNull(bo) && bo;
    }


//    public static  Optional<TypeCategoryEntry> getTypeAndCategoryFromList(TypeCategoryResponse categoriesList, String categoryId, String typeId) {
//
//        return categoriesList.getTypeCategoryMap().stream().filter(typeCategoryEntry -> typeCategoryEntry.getCategoryId().equalsIgnoreCase(categoryId) &&
//                typeCategoryEntry.getTypeId().equalsIgnoreCase(typeId)).findFirst();
//    }
//
//
//    public static Object getResourceIfNotNull(Optional<?> resource, String resourceType, String resourceId) throws ObjectNotFoundLocal {
//        if (resource.isEmpty()) {
//            throw new ObjectNotFoundLocal(resourceType, resourceId);
//        }
//        return resource.get();
//    }
}
